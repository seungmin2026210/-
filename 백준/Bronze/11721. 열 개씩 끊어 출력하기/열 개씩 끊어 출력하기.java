import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String N = scanner.nextLine();
		
		for(int i=0; i<N.length(); i++) {
				System.out.print(N.charAt(i));
			if(i%10==9) {
                // i가 10의 배수이면 줄바꿈을 한다.
				System.out.println();
			}
		}
	}
}