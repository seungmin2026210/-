import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max = 0; 
		int index = 0;
		
		for(int i=0; i<5; i++) {
			int sum =0;
			
			for(int j=0; j<4; j++) {
				int score = scanner.nextInt();
				sum+= score;
				
				if(max<=sum) {
					max = sum;
					index = i+1;
				}
			}
		}
		System.out.println(index+" "+max);
	}
}
