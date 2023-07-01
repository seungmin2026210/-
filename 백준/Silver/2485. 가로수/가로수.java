import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		//추가되는 나무의 수 
		int count = 0;
		
		int[] tree = new int[N];
		
		for(int i=0; i<N; i++) {
			tree[i] = scanner.nextInt();
		}
		
		//오름차순 정렬
		Arrays.sort(tree);

		int gcd = 0;
		
		// 마지막 심은 나무 - 처음 심은 나무 = 가로수 간격
		// 가로수 간격들 중 최대공약수를 가로수 간격과 나누면 됨 
		
		for(int i=0; i<N-1; i++) {
			
			//가로수 간격을 구함 
			int distance = tree[i+1] - tree[i];
			gcd = gcd(distance, gcd);
		}
		
		//전체 가로수의 수는 마지막 가로수 위치 - 첫 가로수위치 / 최대공약수 + 1
		//전체 가로수 - 심어져있는 가로수 (tree.length)를 빼면 심어야하는 가로수의 개수가 나온다.
		System.out.println((tree[N-1]-tree[0])/gcd+1-(tree.length));

		}
	
	// 유클리드 호제법 - 최대공약수 
	public static int gcd(int a, int b) {
		while (b!=0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}