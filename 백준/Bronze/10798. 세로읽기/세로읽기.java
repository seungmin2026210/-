import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char[][] NArray = new char[5][15];
		// 총 5줄, 한줄에 최대 15개의 글자들이 입력됨.
        
		int max = 0; //입력받는 문자열 중 가장 긴 문자열의 길이
		
		for(int i=0; i<5; i++) {
			String str = scanner.next();
			//5줄을 입력받음
			
			max = Math.max(max, str.length());
			//가장 긴 문자열의 길이를 max에 담는다.
			
			for(int j=0; j<str.length(); j++) {
				NArray[i][j] = str.charAt(j);
				//배열에 담기
			}
		}
		
		for(int i=0; i<max; i++) {
			for(int j=0; j<5; j++) {
				if(NArray[j][i]=='\0') {
					continue;
					//char 배열의 초기값은 \0 이다.
				}
				
			System.out.print(NArray[j][i]);
			}
		}
	}
}