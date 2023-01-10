import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt();
		int[] scoreArr;
		
		
		for(int i=0; i<c;i++) {
			
			int n = scanner.nextInt(); // 학생의 수 
			scoreArr = new int[n]; // 학생의 점수를 담을 배열 
					
			double sum=0; 
			
			for(int j=0;j<n;j++) {
				int score = scanner.nextInt(); // 성적입력 
				scoreArr[j]=score;// 성적을 배열에 담는다. 
				sum+=score; // 성적의 누적 합 
				}
			
			double avage=sum/n;// 평균
			double count=0; 
			
			for(int k=0;k<n;k++) {
				if(scoreArr[k]>avage) count++; // 성적이 평균 이상인 학생의 수 
				}
			System.out.printf("%.3f%%\n", (count/n)*100);
		}
	}
}
