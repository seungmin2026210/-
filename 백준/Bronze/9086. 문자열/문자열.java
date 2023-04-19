import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();//테스트 케이스 개수
		
		for(int i=0; i<T; i++) {
			String j = scanner.next(); //입력받을 문자
			System.out.print(j.charAt(0));
            System.out.println(j.charAt(j.length()-1));
		}
	}
}