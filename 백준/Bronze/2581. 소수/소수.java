import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt(); 
		int M = scanner.nextInt(); 
		
		
		int sum =0;
		List<Integer> numberList = new ArrayList<>();
		
		for(int i=N; i<=M; i++) {
			
			boolean num = true;
			
			if(i==1) {
				continue;
			}
			
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j==0) {
					num=false;
					break;
				}
			}
			
			
			if(num) {
				sum+=i;
				numberList.add(i);
			}
		}
	
		if(numberList.isEmpty()) {
			System.out.println("-1");
		} else {
			System.out.println(sum);
			System.out.println(numberList.get(0));
		}
	}
}