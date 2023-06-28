import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        //숫자 개수 
        int N = scanner.nextInt();
        
        //합을 구해야 하는 횟수 
        int M = scanner.nextInt(); 
        
        int[] arr = new int[N+1];
        
        //구간합 구하기
        for(int i=1; i<=N; i++) {
        	arr[i] = arr[i-1]+scanner.nextInt();
        }
       
        for(int i=0; i<M; i++) {
        	int a = scanner.nextInt();
        	int b = scanner.nextInt();
        	System.out.println(arr[b]-arr[a-1]);
        }
	}
}