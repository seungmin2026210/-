import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		int sum = A+B+C;
		
		if(sum==180) {
			if(A==60 && B==60 && C==60) {
				System.out.println("Equilateral");
			} else if(A==B||B==C||A==C) {
				System.out.println("Isosceles");
			} else{
				System.out.println("Scalene");
			} 
		} else {
			System.out.println("Error");
		}
	}
}