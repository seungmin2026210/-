import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt(); //설탕의 무게
		
		// N을 3으로 나누었을 때 나머지가 5의 배수 
		// N을 5로 나누었을 때 나머지가 3의 배수
		// 가장 적은 값이 나와야 하기 때문에 N을 5로 나누었을 때 나머지가 3의 배수가 되는 경우를 가지고 계산
		
		if(N == 4|| N==7) {
			
			//4와 7은 3과 5로 구성할 수 없는 수.	
			System.out.println("-1");
			
		} else if (N%5==0) {
			
			//N이 5로 나누어떨어지는 경우 N/5를 바로 출력
			System.out.println(N/5);
			
		} else if(N%5==1 || N%5==3) {
			
			//N이 5로 나누고 나머지가 1또는 3인 경우
			System.out.println((N/5)+1);
			
		} else if(N%5==2 || N%5==4) {
			
			//N이 5로 나누고 나머지가 2또는 4인 경우
			System.out.println((N/5)+2);
		}
	}
}