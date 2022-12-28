import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int count =1; // 겹 수 
		int A = 2; // 첫번째 겹의 최소값 
		
		if(N==1) {
			System.out.println(count);
		} else {
			
			while (A<=N) { // 범위가 N보다 커지기 직전까지 반복
				A=A+(6*count); // 다음 겹의 최소값으로 초기화
				count++; // count 1증가
			}
			System.out.println(count);
		}
	}
}
	


	