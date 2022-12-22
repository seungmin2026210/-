import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numarr = new int[9];
		int num = 0;
		int count=0;
		
		for(int i=0; i<9; i++) {
			int n = scanner.nextInt();
			numarr[i]=n;
			if(num<n) {
				num=n;
				count=i+1;
			} 
			
		}
		System.out.println(num);
		System.out.println(count);
		}	
	}
