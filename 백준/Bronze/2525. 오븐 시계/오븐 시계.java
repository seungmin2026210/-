import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt(); 
		int m = scanner.nextInt();
		int a = scanner.nextInt();
		
		int total = m+a;
		int b = total/60;
		
		if((total/60)>=1) {
			h+=b;
			if(h>=24) {
				h=h-24;
			}
			total = total-(60*b);
			System.out.println(h+" "+total);
		} else {
			System.out.println(h+ " "+total);
		}
		
	}
}