/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i=1; i<=T; i++) {
		       StringTokenizer st = new StringTokenizer(br.readLine());
			   int H1 = Integer.parseInt(st.nextToken());
			   int M1 = Integer.parseInt(st.nextToken());
			   
			   int H2 = Integer.parseInt(st.nextToken());
			   int M2 = Integer.parseInt(st.nextToken());
			   
			   int MSum = M1 + M2 ;
			   int HSum = H1 + H2;
			   if(MSum>60) {
				   HSum += MSum/60;
				   MSum -= (MSum/60)*60;
			   }
			   
			   if(HSum>12) {
				   HSum -= 12;
			   }
			   
			  System.out.println("#"+i+" "+HSum+" "+MSum);
	   }
   }
}