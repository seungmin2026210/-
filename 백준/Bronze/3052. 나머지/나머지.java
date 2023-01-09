import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		int count =1; 
		int[] numArr = new int[10];
		
		for(int i=0; i<10; i++) {
			numArr[i]= scanner.nextInt()%42; 
			// 입력과 동시에 42를 나눈 나머지를 배열에 넣는다
			}
		Arrays.sort(numArr); // 배열을 오름차순 정렬한다.
		
		for(int j=0;j<9;j++) {
			if(numArr[j]!=numArr[j+1]) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}