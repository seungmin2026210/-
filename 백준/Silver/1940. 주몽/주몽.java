import java.util.Arrays;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//재료의 개수 
		int N = scanner.nextInt();
		
		//갑옷을 만드는데 필요한 수 
		int M = scanner.nextInt();
		
		int[] NArr = new int [N];
		
		//재료들의 고유 번호를 배열에 저장
		for(int i=0; i<N; i++) {
			NArr[i] = scanner.nextInt();
		}
		
		//오름차순으로 배열 정렬
		Arrays.sort(NArr);
		
		
		int count = 0;  //갑옷을 만들 수 있는 경우의 수 
		int start_index = 0; //min 값
		int end_index = N-1; //max 값 
		
		//투포인터 방식 이용
		while(start_index<end_index) {
			if(NArr[start_index]+NArr[end_index]<M) {
				//만약 시작인덱스 + 끝 인덱스 < 재료의 수 이면, 시작인덱스 ++
				start_index++;
			} else if (M<NArr[start_index]+NArr[end_index]){
				//만약 재료 수 <시작인덱스 + 끝 인덱스 이면 끝 인덱스 --
				end_index --;
			} else {
				count++;
				start_index++;
				end_index--;
			}
		}
		System.out.println(count);
	}
}
         