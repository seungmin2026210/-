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
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
       String S[] = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
       Scanner scanner = new Scanner(System.in);
       int T = scanner.nextInt();
       for(int t=1; t<=T; t++) {
           int n = scanner.nextInt();
           int k = scanner.nextInt()-1;
           Integer a[] = new Integer[n];
           for(int i=0; i<n; i++) {
               int mid = scanner.nextInt(); 
               int fin = scanner.nextInt();
               int hom = scanner.nextInt();
               a[i] = mid*35 + fin*45 + hom*20;
           }
           int k_score = a[k];
           Arrays.sort(a, Collections.reverseOrder());
           int k_rank = Arrays.asList(a).indexOf(k_score);
           System.out.format("#%d %s\n", t, S[10*k_rank/n]);
       }
   }
}