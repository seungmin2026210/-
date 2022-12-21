import java.util.Scanner;
public class Main {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int s = 0;
		int m = 0;
		
		for(int i=1; i<=n;i++) {
			int num1 = scanner.nextInt();
			if(i==1) {
				s = num1;
				m = num1;
			} else if(m<=num1) {
				m = num1;
			} else if (s>=num1) {
				s = num1;
			}
		}	
		System.out.println(s +" "+m);
	}
}
