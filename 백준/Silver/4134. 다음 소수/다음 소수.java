import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // 테스트케이스
		
		
		for(int i=0; i<N; i++) {
			long number = scanner.nextLong();
			
			//소수를 찾는 메서드
			BigInteger nextPrimeNum = new BigInteger(String.valueOf(number));
			
			if(nextPrimeNum.isProbablePrime(10)) {
				//입력 값이 소수면 그대로 출력
				System.out.println(nextPrimeNum);
			} else {
				//입력 값이 소수가 아니면 다음으로 큰 소수를 구해서 출력
				System.out.println(nextPrimeNum.nextProbablePrime());
			}
		}
	}
}