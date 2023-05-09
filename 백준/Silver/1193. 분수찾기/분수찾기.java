import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt(); //입력 받은 수
		
		int line = 0; //라인 수 
		int count = 0; //해당 라인 마지막 수를 구변할 변수
		int top=0; //분자
		int bottom = 0; //분모
		
		while (count<N) {
			line++;
			count = line * (line+1)/2;
		}
		
		if(line%2 !=0 ) {
			//홀수인경우 (분자 --, 분모++)
			top = 1+count-N;
			bottom = line+N-count;
		} else {
			//짝수인경우 (분자++ 분모--)
			bottom = 1+count-N;
			top = line+N-count;
		}
		System.out.println(top+"/"+bottom);
	}
}