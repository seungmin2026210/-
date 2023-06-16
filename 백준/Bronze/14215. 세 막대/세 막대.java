import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // 막대의 길이는 마음대로 줄일 수 있음
        // a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구해야 함.
        
        // 삼각형의 조건 : 가장 긴 변의 길이가 다른 변의 길이의 합보다 작아야 한다 
        // 이 조건을 지키는 경우 세 변의 합을 출력
        // 그렇지 않을 경우 가장 긴 변의 길이를 줄여서 출력 
        
        int max = Math.max(Math.max(a,b),c); // 가장 긴 변의 길이를 저장
        
        int sum = a+b+c;
        
        if(max < sum-max) {
        	
        	System.out.println(sum);
        	
        } else {
        	
        	// 가장 긴 변의 길이를 줄이기 때문에 max를 사용
        	// 삼각형의 조건은 가장 긴 변의 길이가 다른 변의 길이의 합보다 작아야 하기 때문에
        	// 모든둘레 - 가장 긴 변의 길이 - 1 
        	// => 모든 둘레 - 가장 긴 변의 길이 = 다른변의 길이의 합 (sum-max)
        	// 다른변의 길이의 합보다 작아야 하나, 그중 가장 커야 하기 때문에 -1만 해줌 (sum-max-1)
        	// 즉 (sum-max) + (sum-max-1) => (sum-max)*2-1
        	
        	System.out.println((sum-max)*2-1);
        }
	}
}
        
        