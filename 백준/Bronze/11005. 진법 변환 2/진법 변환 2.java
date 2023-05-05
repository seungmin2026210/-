import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		long N = scanner.nextInt(); //10 진수 N
		int B = scanner.nextInt(); //몇 진수로 바꿀건지
		
		List<Character> NArray = new ArrayList<>();
		
		while (0<N) {
			if(N%B<10) {
				NArray.add((char)(N%B+'0'));
			} else {
				NArray.add((char)(N%B-10+'A'));
			}
			
			N /= B;
		}
		
		for( int i=NArray.size()-1; 0<=i; i--) {
			System.out.print(NArray.get(i));
		}
	}
}
