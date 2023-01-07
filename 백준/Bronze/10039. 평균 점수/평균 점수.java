import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		int scoresum=0;
		
		for (int i = 1; i <= 5 ; i++) {
			int score = scanner.nextInt();
			if(score<40) {
				score=40;
			}
			scoresum+=score;
			}
		System.out.println(scoresum/5);
	}
}