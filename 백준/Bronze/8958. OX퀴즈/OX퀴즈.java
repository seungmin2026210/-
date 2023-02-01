import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      
	  Scanner scanner = new Scanner(System.in);
 	  int T = scanner.nextInt();
	  
	  for (int i=1; i<=T; i++) { //테스트 케이스 만큼 반복
		  String answer = scanner.next();
		  
		  int score = 0;
		  int count =0;
		  for(int j=0; j<answer.length();j++) {
			  
			  if(answer.charAt(j)=='O') {
				  count++;
				  score+=count;
			  } else if(answer.charAt(j)=='X') {
				  count=0;
			  }
		  }  
		  System.out.println(score);
	  }
   }
}