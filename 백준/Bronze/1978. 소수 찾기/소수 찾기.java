import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int number ;
		int count=0;
		
		for(int i=1; i<=N; i++) {
			number = scanner.nextInt();
			
			for(int j=2; j<=number; j++) {
				if(j==number) {
					count++;
				}
				if(number%j==0) {
					break;
				}
			}
		}
		System.out.println(count);
	}
}