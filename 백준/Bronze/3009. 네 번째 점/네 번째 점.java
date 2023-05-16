import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] A = { scanner.nextInt(), scanner.nextInt()};
		int[] B = { scanner.nextInt(), scanner.nextInt()};
		int[] C = { scanner.nextInt(), scanner.nextInt()};
		
		int x;
		int y;
		
		//쌍을 이루지 않는 좌표를 저장
		// x좌표 찾기 
		if(A[0]==B[0]) {
			x = C[0];
		} else if (A[0]==C[0]) {
			x = B[0];
		} else {
			x = A[0];
		}
		
		//y좌표 찾기
		
		if(A[1]==B[1]) {
			y = C[1];
		} else if (A[1]==C[1]) {
			y = B[1];
		} else {
			y = A[1];
		}
		
		System.out.println(x +" "+y);
	}
}