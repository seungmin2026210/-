import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();//바구니 범위
		int M = scanner.nextInt();//공을 넣을 횟수
		
		int[] NArr = new int [N]; //배열
		
		for(int i=0; i<M; i++) {
			int I = scanner.nextInt(); //시작할 바구니
			int J = scanner.nextInt(); //종료할 바구니
			int K = scanner.nextInt(); //공번호
			
			for(int j=I-1; j<J; j++) {
				NArr[j]=K; 
				}
		}
		
		for(int k=0; k<NArr.length;k++) {
			System.out.print(NArr[k]+" ");
		}
		
	}
}