import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[] args) throws Exception {

  		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//학생의 수 
		int N = Integer.parseInt(br.readLine());
		
		
		//대기열
		Queue<Integer> queue = new LinkedList<>();
		
		//추가대기열
		Stack<Integer> stack = new Stack<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			queue.offer(Integer.parseInt(st.nextToken()));
		}
		
		int start = 1;
		
		while (!queue.isEmpty()) {
			
			// 대기열 == 간식을 받아야 할 사람 
			if(queue.peek() == start) {
				queue.poll();
				start++;
			} else if(!stack.isEmpty() && stack.peek() == start) {
				// 추가대기열 == 간식을 받아야 할 사람 
				stack.pop();
				start++;
			}else {
				// 대기열, 추가대기열 모두 간식을 받아야 하는사람과 다른 경우
				// 대기열에 있는 사람을 추가 대기열로 이동
				
				stack.push(queue.poll());
			}
		}
		
		//대기열에 사람이 다 빠진 뒤 추가 대기열에 사람이 있는지 체크
		while(!stack.isEmpty()) {
			if(stack.peek() == start ) {
				//추가대기열에 있는 사람 == 간식을 받아야 하는 사람
				stack.pop();
				start++;
			} else {
				System.out.println("Sad");
				return;
			}
		}
		
		System.out.println("Nice");       
         
     }
}