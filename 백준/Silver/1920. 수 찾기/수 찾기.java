import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i]=scanner.nextInt();
		}
		
		//이분 탐색을 위해 배열 정렬 
		Arrays.sort(arr);
		
		int M = scanner.nextInt();
		
		for(int i=0; i<M; i++) {
			//찾고자 하는 값이 있으면 1, 없으면 0
			
			if(binarySearch(arr, scanner.nextInt())>=0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}

	private static int binarySearch(int[] arr, int target) {
		//탐색 범위의 첫 번째 인덱스
		int low = 0;
		
		//탐색 범위의 마지막 인덱스
		int high = arr.length-1;
		
		while(low<=high) {
			//첫 인덱스와 마지막 인덱스 사이의 중간 인덱스를 가져온다.
			int mid = (low+high)/2;
			
			//target값이 중간 위치의 값보다 작을 경우
			if(target <arr[mid]) {
				//마지막 인덱스를 중간값 -1로 변경 
				high = mid - 1;
			} else if (target>arr[mid]) {
			//target 값이 중간 위치 값보다 클 경우
		    //시작 인덱스를 중간값 +1 로 변경 
				low = mid + 1;
			} else {
				//target값과 중간위치의 값이 같을 경우 
				return mid;
			}
		}
		return -1;
	}
}
