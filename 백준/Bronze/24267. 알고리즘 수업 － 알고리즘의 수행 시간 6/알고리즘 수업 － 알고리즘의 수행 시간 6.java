import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Long N = scanner.nextLong();
		
		System.out.println((N * (N-1) * (N-2))/6);
		System.out.println(3);
	}
}