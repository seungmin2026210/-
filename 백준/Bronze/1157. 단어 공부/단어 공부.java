import java.util.Scanner;

public class Main {
   public static void main(String[] args)  {
      
	  Scanner scanner = new Scanner(System.in);
	  int[] arr = new int[26];
	  String st = scanner.next();
	  
	  for(int i=0; i<st.length();i++) {
		  
		  if('A' <= st.charAt(i) && st.charAt(i)<='Z') {
			  arr[st.charAt(i)-'A']++;
		  } else {
			  arr[st.charAt(i)-'a']++;
		  }
	  } // 입력받은 문자를 하나씩 떼서 배열에 넣는다. 대문자는 65가 A, 소문자는 97이 a
	  
	  int max = -1; 
	  char ch = '?';
	  
	  for(int i=0; i<26;i++) {
		  if(max<arr[i]) {
			  max=arr[i];//arr[i]의 값이 max보다 크면 max 변수에 넣어주기
			  ch=(char) (i+65); // 대문자로 입력 받아야 하니까 65를 더해주기 
		  } else if(arr[i]==max) {
			  ch='?';
		  }
	  }
	  System.out.println(ch);
   }
}