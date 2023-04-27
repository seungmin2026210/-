import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt(); //테스트케이스의 개수 
		
		for(int i=0; i<T; i++) {
			int N = scanner.nextInt();
			
			int quarter = N/25;
			N = N%25;
			
			int dime = N/10;
			N = N%10;
			
			int nickel = N/5;
			N = N%5;
			
			int Penny = N%5;
			
			System.out.println(quarter+" "+dime+" "+nickel+" "+Penny);
		}
	}
}