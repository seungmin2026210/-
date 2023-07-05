import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        //스택을 생성
        Stack<Integer> stack = new Stack<>();
        
        //출력할 결과물을 저장
        StringBuilder answer = new StringBuilder();

        int start = 0;

        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(br.readLine());

            if(start<tmp){
            	// start + 1부터 입력받은 tmp까지 push
                for (int j = start+1; j <= tmp; j++) {
                    stack.push(j);
                    // + 를 저장
                    answer.append('+').append('\n');
                }
                
                //다음 push 할 때 오름차순을 유지하기 위해 변수 초기화 
                start = tmp;
                
            } else if(stack.peek() != tmp){
            	//스택의 최상단 값이 입력받은 값과 같지 않을 경우 NO를 반환 및 종료 
                System.out.println("NO");
                return;
            }
            stack.pop();
            
            // - 를 저장 
            answer.append('-').append('\n');
        }
        System.out.println(answer);
    }
}