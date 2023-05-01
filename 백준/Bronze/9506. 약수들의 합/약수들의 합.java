import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			int N = scanner.nextInt();
			
			if(N == -1) {
				break;
			}
			
			ArrayList<Integer> NArray = new ArrayList<Integer>(); //약수를 담을 배열
			int NSum =0; // 약수의 합
			

			for(int i=1; i<N; i++) {
				if(N%i==0) {
					NArray.add(i);
					NSum+=i;
				}
			} //약수일 때 숫자 담기
			
			
			if(NSum!=N) {
				System.out.println(N+" is NOT perfect.");
				continue;
			} else {
			
				System.out.print(N +" = ");
				
				for(int i=0; i<NArray.size(); i++) {
					
					if(NArray.get(i)==1) {
						System.out.print(NArray.get(i));
					} else {
					System.out.print(" + "+NArray.get(i));
					}
				}
				System.out.println();
			}
		}
	}
}
   