import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n=scanner.nextInt();
		int num = 1;
		int sum =0;
		
		for(;num<=n;num++) {
			sum+=num;
		}
		System.out.println(sum);
	}
}