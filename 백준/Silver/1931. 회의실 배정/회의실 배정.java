import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); //회의의 수 
        
        int[][] NArray = new int[N][2];
        
        for(int i=0; i<N; i++) {
        	NArray[i][0]=scanner.nextInt(); //회의 시작시간
        	NArray[i][1]=scanner.nextInt(); //회의 끝시간 
        }
        
        // Narray[1][2] 와 Narray[2][1]을 비교 후 같지 않으면 됨.
        // 시작시간을 기준으로 정렬 해 줌
        
        Arrays.sort(NArray, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
                
				//만약 종료시간이 같을 경우 시작시간이 빠른 순으로 정렬
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0] ;
				}
				return o1[1] - o2[1];
			}
		});
        
        int count = 0;
        int endTime = 0;
        
        for(int i=0; i<N; i++) {
        	
        	//직전 종료시간이 다음 회의시작 시간보다 작거나 같다면 갱신
        	if(endTime <= NArray[i][0]) {
        		endTime = NArray[i][1];
        		count++;
        	}
        }
        System.out.println(count);
	}
}