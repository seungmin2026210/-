import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		int[] numArr = new int[5];
		int sum = 0;
		
		
		for(int i=0; i<numArr.length;i++) {
			numArr[i] = scanner.nextInt(); 
			sum += numArr[i];
		}
		
		Arrays.sort(numArr);
		
		System.out.println(sum/numArr.length);
		System.out.println(numArr[2]);
	}
}
