import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //줄 서 있는 사람들이 수  
        
        int[] time = new int[N];
        
        for(int i=0; i<N; i++) {
        	time[i]=scanner.nextInt(); //돈을 뽑는데 걸리는 시간
        }
        
        //각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값
        //인출시간이 적은 순으로 정렬
        Arrays.sort(time);
        
        int prevTime = 0; //대기시간 누적합 
        int totalTime = 0; //대기시간 총합
        
        // 1 / 1+2 / 1+2+3 / 1+2+3+3 / 1+2+3+3+4
        for(int i=0; i<N; i++) {
        	totalTime += prevTime + time[i];
        	prevTime += time[i];
        }
        
        System.out.println(totalTime);
	}
}