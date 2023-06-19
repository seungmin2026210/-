import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		//최소값으로 만들기 
		
        Scanner scanner = new Scanner(System.in);
        
        //입력받기 -> -로 나누기 -> +로 나누기 -> 나눈 값들 더하기 -> 예외 처리해주기 -> 출력하기
        
        //초기 상태 여부 확인을 위한 값으로 설정
        int sum = Integer.MAX_VALUE;
        
        // -을 기준으로 토큰을 나눈다. 
        StringTokenizer st  = new StringTokenizer(scanner.next(),"-");
        
        // - 으로 나뉜 토큰을 +로 다시 한 번 더 나누기 
        while (st.hasMoreTokens()) {
        	int tmp = 0;
        	
        	StringTokenizer str = new StringTokenizer(st.nextToken(), "+");
        	
        	//덧셈으로 나뉜 토큰들을 모두 더한다.
        	while ( str.hasMoreTokens()) {
        		tmp += Integer.parseInt(str.nextToken());
        	}
        	
        	//첫 수가 음수가 나오면 안되기 때문에 
        	// 첫 번째토큰인 tmp 값이 첫번째 수가 됨
        	//sum =0이 됨 
        	if(sum == Integer.MAX_VALUE) {
        		sum = tmp;
        	} else {
        		//두 번째 토큰 부터는 sum에서 tmp를 뺌
        		//덧셈으로 나눠진 토큰들을 모두 더해서 뺌
        		
        		sum -= tmp;
        	}
        }
        System.out.println(sum);
	}
}
