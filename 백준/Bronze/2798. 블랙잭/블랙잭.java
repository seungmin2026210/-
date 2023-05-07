import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt(); //카드 개수
		int M = scanner.nextInt(); //카드의 합 바운더리
		
		int[] number = new int[N];
		
		for(int i=0; i<N; i++) {
			number[i] = scanner.nextInt();
		}
		 
		int sum = 0; //카드 합
		int answer = 0; //근사치를 담을 값
		
		for(int i=0; i<N; i++ ) {
			for(int j = i+1; j<N; j++ ) {
				for(int k= j+1; k<N; k++) {
					sum = number[i] + number[j] + number[k]; 
					if(answer<sum && sum <=M) {
						answer = sum;
					}
				}
			}
		}
		System.out.println(answer);
	}
}