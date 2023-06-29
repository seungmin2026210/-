import java.util.*;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int answer = 0;
		
		for(int i=1; i<=N; i++) {
			int sum =0;
			
			for(int j=i; j<=N; j++) {
				sum+=j;
				
				if(N<sum) {
					break;
				} else if (sum==N) {
					answer++;
					break;
				}
			}
		}
		System.out.println(answer);
	}
}