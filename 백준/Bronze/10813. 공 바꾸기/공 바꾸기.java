import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt(); //바구니 갯수
		int M = scanner.nextInt(); //몇번 공을 바꿀건지
		
		int[] NArray = new int [N];
		
		for(int i=0;i<N;i++) {
			NArray[i] =i+1; 
		} 
		//처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공들을 담아줌.
		//i는 0부터 시작하니까 i+1을 해준다.
		//ex) 1,2,3,4,5
		

		
		for(int i=1; i<=M; i++) { 
			int tmp = 0; 
			int I = scanner.nextInt(); //I번째 바구니를 
			int J = scanner.nextInt(); //J번째 바구니와 바꾼다
			
			tmp=NArray[I-1];
			NArray[I-1] = NArray[J-1]; //I번째 바구니를 J로 변경
			NArray[J-1] = tmp;; //J번째 바구니를 tmp에 넣어두었던 i바구니로 변경 
		}
		
		for(int i=0; i<NArray.length; i++) {
			System.out.print(NArray[i]+" ");
		}
	}
}
