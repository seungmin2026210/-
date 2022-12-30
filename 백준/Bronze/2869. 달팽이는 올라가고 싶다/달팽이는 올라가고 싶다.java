import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader 으로 입력 받음.
		StringTokenizer st = new StringTokenizer(br.readLine());
		// String 으로 받는 BufferedReader 를 int형으로 쓸 수 있도록 
		// 문자열을 하나하나 떼서 int로 바꾸려면 (br.readLine()," ");로 
		
		int A = Integer.parseInt(st.nextToken()); //낮에 올라가는 m
		int B = Integer.parseInt(st.nextToken()); //밤에 미끄러지는 m
		int V = Integer.parseInt(st.nextToken()); // 나무 높이 m
		//int형으로 바꿔주는 st 사용 
		//왜 br을 안쓰냐 ? -> st안에 br이 들어있어서 br실행이 됨.
		
		int count=(V-B)/(A-B); //달팽이가 다 올라가는데 필요한 day
		if((V-B)%(A-B)!=0) {
			count++;
		}
		
		System.out.println(count);
	}
}