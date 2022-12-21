import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num= new int[n];
		int s = 0;
		int m = 0;
		
		for(int i=0; i<n;i++) {
			int num1 = scanner.nextInt();
			num[i] = num1; 
			
			if (i==0) {
				s=num1; 
				m=num1;  
			} 
			
			if(s>num1) { 
				s = num1; 
			}
			if(m<num1) { 
				m = num1;
			}
		}	
		System.out.println(s + " "+ m);
	}
}
