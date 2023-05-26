import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt(); // 참여자 수
		int K = scanner.nextInt(); // 상을 받는 인원수
		
		Integer[] NArray = new Integer[N];
		
		for(int i=0; i<N; i++) {
			NArray[i] = scanner.nextInt();
		}
		
		Arrays.sort(NArray, Collections.reverseOrder()); //배열을 내림차순으로 정렬
		
		System.out.println(NArray[K-1]);
	}
}