import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		
		if(45<=m) {
			m-=45;
		} else {
			m=60+(m-45);
			h-=1;
			if(h==-1){
				h=23;
			}
		}
		System.out.print(h+" "+m);
	}
}