import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		//a,b,c가 모두 0이면 종료 
		if(a == 0 && b == 0 && c == 0){
		      break;
		    }

	    if(a == b && b == c && c == a ){
	    	System.out.println("Equilateral");
	      }
	      else if(a >= b+c || b >= c + a || c >= a + b){
	    	System.out.println("Invalid");  
	      }
	      else if(a == b || b == c || c == a){
	    	System.out.println("Isosceles");  
	      }
	      else if(a != b && b != c && c != a){
	    	  System.out.println("Scalene");
	      }
	   }
	}
}
