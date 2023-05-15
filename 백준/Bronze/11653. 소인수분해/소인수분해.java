import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for(int i=2; i<=N; i++) {
			for(;;) {
			if(N%i==0) { 
				//나누어떨어지면 i를 출력하고 N은 i를 나눈값으로 다시 넣어준다.
				N = N/i;
				System.out.println(i);
				} else {
					break;
				}
			}
		}
	}
}