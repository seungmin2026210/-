import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 합을 구해야 하는 정수n
		if (n == 0) {
            System.out.print(1);
            return;
        }
        int num = n;
        int sum = 0;
        int count = 0;
        while (sum != n) {
            sum = num;
            count++;
            if (n < 10) {
                n = n*10 + n;
            } else {
                n = (n%10)*10 + ((n%10)+(n/10))%10;
			}
		}	
		System.out.println(count);
	}
}