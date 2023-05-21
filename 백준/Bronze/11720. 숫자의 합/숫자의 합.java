import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		String string = scanner.next();
		int sum=0;
		
		for(int i=0; i<N; i++) {
			sum+= string.charAt(i)-48; //아스키코드로 48은 숫자 0
		}
		
		System.out.println(sum);
	}
}