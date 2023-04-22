import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt(); //바구니 갯수
		int[] Arr = new int [N];
		
		for(int i=0; i<Arr.length; i++) {
			Arr[i] = i+1;
		}
		int M = scanner.nextInt(); //반복할 횟수 

		for(int i=0; i<M; i++) {
			int I = scanner.nextInt()-1;
			int J = scanner.nextInt()-1;
			
			while (I<J) {
				int tmp = Arr[I];
				Arr[I++] = Arr[J];
				Arr[J--] = tmp;
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.print(Arr[i]+" ");
		}
    }
}
	