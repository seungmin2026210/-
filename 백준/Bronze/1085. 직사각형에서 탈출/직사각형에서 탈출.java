import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//한수의 위치 
		int x = scanner.nextInt(); 
		int y = scanner.nextInt(); 
		
		//오른쪽 위 꼭짓점
		int w = scanner.nextInt();  
		int h = scanner.nextInt(); 
		
		int x_min = Math.min(x, w-x); // x축 최소 거리
		int y_min = Math.min(y, h-y); // y축 최소 거리
		
		//x와 y중 가장 작은 값을 출력 
		System.out.println(Math.min(x_min, y_min));
	}
}