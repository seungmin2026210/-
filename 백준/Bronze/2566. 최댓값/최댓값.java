import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

		int max =0;
		int a = 0; //행
		int b = 0; //열
		
		int[][] NArray = new int[9][9];
		
		for(int i=0; i<9;i++) {
			for(int j=0; j<9; j++) {
				NArray[i][j] = scanner.nextInt(); // 배열에 숫자넣기
				if(max<NArray[i][j]) {
					max=NArray[i][j];
					a = i;
					b = j;
                    //배열에 숫자 넣으면서 max보다 크다면 max, a, b값 새로 넣기
				}
			}
		}		
	
		System.out.println(max);
		System.out.println((a+1) +" "+(b+1));
	}
}