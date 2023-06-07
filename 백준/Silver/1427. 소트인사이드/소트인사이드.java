import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String N = scanner.next();
		
		char[] answer = N.toCharArray();
		Arrays.sort(answer);
		
		for(int i=N.length()-1; 0<=i; i--) {
			System.out.print(answer[i]);
		}
	}
}