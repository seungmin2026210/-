import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int result =0;
		
		for(int i=0; i<N; i++) {
			
			int number = i;//가장 큰 생성자
			int sum = 0;
			
			while (number!=0){
				sum += number % 10;
				//각 자리수 더하기
				number /=10;
			}
			
			if(sum+i==N) {
				result =i;
				break;
			}
			
		}
		
		System.out.println(result);
	}
}