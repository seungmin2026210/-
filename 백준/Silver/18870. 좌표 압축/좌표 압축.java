import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        
        String[] arr = br.readLine().split(" ");
        
		int[] sortArr = new int [N];
		int index = 0;
		
		for( int i=0; i<arr.length; i++) {
			sortArr[i]= Integer.parseInt(arr[i]);
		}
		
		int[] temp = sortArr.clone();
		
		Arrays.sort(sortArr);
		
		HashMap<Integer, Integer> hmap = new HashMap<>();
		
		for(int i=0; i< sortArr.length; i++) {
			if(!hmap.containsKey(sortArr[i])) {
				hmap.put(sortArr[i], index++);
			}
		}
			
		for(int i=0; i<N; i++) {
			sb.append(hmap.get(temp[i])).append(" ");
		}
		
		System.out.println(sb.toString());
	}
}