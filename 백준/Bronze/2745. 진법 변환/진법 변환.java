import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String N = scanner.next(); //수N
		int B = scanner.nextInt(); //수B
		
		//10진수로 바꾸는 법은 몇 진수이든 방법이 같다
		// 각 자리의 10진수 숫자 * 진수의 각 자리수 제곱 모두 더하기
		//예를들어 2진수 1101일때에는 1*2^3 +  1*2^2 + 0*2^1 + 1*2^0 = 13
		
		long result = 0; //결과값을 담을 변수. int의 범위를 초과할 수 있으니 long으로 담아준다. 
		
		for(int i = 0; i<N.length() ; i++ ) {
			if( '0'<= N.charAt(i) && N.charAt(i) <='9') { //한자리를 뽑아내서 비교.
				result = result * B + ((int)N.charAt(i)-(int)'0');
			} else {
				result = result * B  + ((int)N.charAt(i)-(int)'A'+10);
			}
		}
		System.out.println(result);
	}
}