import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count=0;
		
		int[] numarr= new int[n];
		
		for(int i=0;i<n;i++) {
			int num= scanner.nextInt();	
			numarr[i]=num;
		}
		
	
		int v = scanner.nextInt();
		
		for(int i=0;i<numarr.length;i++) {
			if(v==numarr[i]) {
				count++;
			}
			
		}
		System.out.println(count);
	
	}
}