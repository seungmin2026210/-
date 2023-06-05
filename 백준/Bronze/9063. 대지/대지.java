import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int minX = 10000; 
		int minY = 10000;
		
		int maxX = -10000;
		int maxY = -10000;
		
		for(int i=0; i<N; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			minX = Math.min(minX, x);
			maxX = Math.max(maxX, x);
			
			minY = Math.min(minY, y);
			maxY = Math.max(maxY, y);
		}

		System.out.println((maxX-minX)* (maxY-minY)); // 직사각형의 넓이를 구해야 해서
	}
}