import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		int totalprice= scanner.nextInt();
		int totalcount= scanner.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=totalcount;i++) {
			int price=scanner.nextInt();
			int count=scanner.nextInt();
			sum+=price*count;
			}
		if(sum==totalprice) {
			System.out.println("Yes");
		}else {System.out.println("No");
		} 
	}
}