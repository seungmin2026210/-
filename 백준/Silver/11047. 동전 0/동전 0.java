import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); //준규가 가지고 있는 동전의 종류 
        int K = scanner.nextInt(); //동전 가치의 합 
        int min = 0; // 동전 개수의 최솟값
        
        int[] A = new int [N];
        
        for(int i=0; i<N; i++) {
        	A[i] = scanner.nextInt();
        }
        
        Arrays.sort(A);

        for(int i=N-1; 0<=i; i--) {
        	
    		// A[i]가 k보다 작거나 같은 coin[i]를 찾는다.
    		// 가치의 합보다 작거나 같은 동전의 종류 중 가장 큰 동전의 종류를 찾는다.
        	if( A[i]<=K  ) {
        		
        		// K/A[i] : 동전이 몇개 쓰였는지 개수를 센다.
        		min += (K/A[i]);
        		
        		// 동전 가치를 K/A[i]하고 남은 나머지 (K%A[i]) 로 바꿔준다.
        		K = K%A[i]; 
        		
        	} 
        }
        System.out.println(min);
	}
}