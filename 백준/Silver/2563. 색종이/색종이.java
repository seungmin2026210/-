import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[][] paper = new int [100][100]; //도화지의 크기 100x100
		int count =0; 
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); //색종이의 수 
		
		for(int i=0; i<N; i++) {
			int X = scanner.nextInt();
			//색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리
			
			int Y = scanner.nextInt();
			//색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리
			
			//붙이는 종이의 크기 : 10x10
			for(int j=X; j<X+10; j++) { 
				//붙이는 종이의 크기는 10이기 때문에 X에서 X+10까지 
				for(int k=Y ; k<Y+10; k++) {
					//붙이는 종이의 크기는 10이기 때문에 y에서 y+10까지
					
					if(paper[j][k]==0) {
						//만약 배열에서 크기가 체크 되지 않은 위치라면
						
						paper[j][k]=1;
						//종이를 붙였다는 표시를 해 준다.
						count++;
						//너비를 더해준다.
					}
				}
			}
		}
		
		System.out.println(count);
	}
}