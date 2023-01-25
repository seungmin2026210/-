import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

   public static void main(String[] args) throws IOException {
      
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder st = new StringBuilder();
	   
	   int N = Integer.parseInt(br.readLine()); // 줄의 개수 
	   
	   ArrayList<Integer> numlist = new ArrayList<>();
	   for(int i=0;i<N;i++) {
		   numlist.add(Integer.parseInt(br.readLine()));
	   }
	   
	   Collections.sort(numlist);
	   
	   for(Integer e : numlist) {
		   st.append(e).append('\n');
	   }
	   System.out.println(st);
   }
}