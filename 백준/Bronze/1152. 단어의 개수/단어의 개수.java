import java.util.Scanner;

public class Main {
   public static void main(String[] args)  {
      
	  Scanner scanner = new Scanner(System.in);
	  String st = scanner.nextLine();
	  String[] stArr = st.split(" ");
	  
	  int count =0;
	  for(int i= 0; i<stArr.length;i++) {
		  if(stArr[i]=="") {
			  count-=1;
		  } count++;
	  }
	  System.out.println(count);
   }
}