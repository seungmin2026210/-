import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int c = scanner.nextInt();
		int n = scanner.nextInt();
		
		if(a*n+b <= c * n && a <=c) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
