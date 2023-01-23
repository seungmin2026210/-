import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      
	   Scanner scanner = new Scanner(System.in);

	   int sum = (scanner.nextInt() * scanner.nextInt() *scanner.nextInt());
	   String strnum = Integer.toString(sum);
	   
	   for(int i=0; i<10;i++) {
		   int count=0;
		   for(int j=0; j<strnum.length();j++) {
			   if(i==(strnum.charAt(j)-48)) { 
				   count++;
			   }
		   }
		   System.out.println(count);
	   }
   }
}