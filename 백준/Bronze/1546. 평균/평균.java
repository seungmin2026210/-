import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 과목의 개수
		double sum = 0;
		
		double[] score = new double[n];
		
		for(int i=0; i<score.length ;i++) {
			score[i] = scanner.nextInt();
		}
		
		Arrays.sort(score);
		
		for(int i=0; i<score.length;i++) {
			sum += score[i]/score[score.length-1]*100;
		}
		System.out.println(sum/score.length);
		
	}
}