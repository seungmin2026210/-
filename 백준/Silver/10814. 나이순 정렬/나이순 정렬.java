import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
public class Main {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		String[][] arr = new String[N][2];
		
		for(int i=0; i<N; i++) {
			arr[i][0] = scanner.next(); //나이
			arr[i][1] = scanner.next(); //이름
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				//나이를 int형으로 변환하여 비교 
				// o1의 나이가 o2보다 클 경우 순서 변경 
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i][0] +" "+arr[i][1]);
		}	
	}
}