import java.util.*;
 
class Main {
  public static void main(String[] args) {
      		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		char[] charArr = str.toCharArray();
		
		int j=0;
		
		for(int i=0; i<(charArr.length/2);i++) {
			
			if(charArr[i]==charArr[(charArr.length-1)-i]) {
				j++;
			}
		} 
		
		if(j==(charArr.length/2)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}
}