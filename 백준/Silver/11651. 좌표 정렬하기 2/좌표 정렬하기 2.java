import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
		
		//점의 개수
		int N = scanner.nextInt();
		
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			//점을 저장 해준다.
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}
		
		Arrays.sort(arr,(arr1, arr2) -> {
			
			if(arr1[1]==arr2[1]) {
				//y좌표가 같으면, x값을 비교
				return arr1[0] - arr2[0];
			} else {
				//아닌경우 (y좌표가 같지 않은 경우) x값을 비교
				return arr1[1] - arr2[1];
			}
		});
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i][0] +" "+arr[i][1]);
		}
	}
}
