import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int number = 666;
		int count =1;
		
		while(count!=N) {
			number++;
			
			// 666부터 시작해 666을 포함하는 값을 찾을 때 까지 반복
			// 666이 포함 되어 있으면 count 값 증가
			// count == N 이면 n번째 영화 제목은 number
			// contains : 문자열 포함 여부 확인
			// String.valueOf() : int -> String 형 변환
			if(String.valueOf(number).contains("666")) {
				count++;
			}
		}
		System.out.println(number);
	}
}