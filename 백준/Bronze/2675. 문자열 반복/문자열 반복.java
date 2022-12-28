import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(); // 몇줄 받을건지
		
		for(int i=1; i<=num;i++) {
			int count = scanner.nextInt(); // 몇개 반복할건지
			String T = scanner.next(); // 반복할 문자
			
			for(int j=0;j<T.length();j++) {
				for(int k=1; k<=count;k++) {
					System.out.print(T.charAt(j));
				}
			}System.out.println("");
		}
	}
}