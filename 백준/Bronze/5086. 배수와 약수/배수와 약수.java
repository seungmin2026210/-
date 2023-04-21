import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int A = scanner.nextInt(); //첫 번째 숫자
			int B = scanner.nextInt(); //두 번째 숫자
			
            if(A==0 && B==0)break;
			if(B%A==0) {
				System.out.println("factor"); //첫 번째 숫자가 두 번째 숫자의 약수일 때
			} else if(A%B==0) {
				System.out.println("multiple"); //첫 번째 숫자가 두 번째 숫자의 배수일때
			} else {
				System.out.println("neither");//모두 아닐 때 
			}
		}
	}
}