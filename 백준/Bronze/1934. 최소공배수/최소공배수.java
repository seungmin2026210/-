import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); //테스트 케이스의 개수
        
        //먼저 최대공약수를 구한 후 a * b를 한 값에 최대공약수를 나누면 최소공배수를 구할 수 있다
        for(int i=0; i<T; i++) {
        	
        	int a = scanner.nextInt();
        	int b = scanner.nextInt();
        	int d = gcd(a, b); 
        	
        	// 두 수의 곱을 최대공약수로 나눈다.
        	System.out.println(a*b/d);
        }
    }
	
	//최대 공약수를 구하는 메서드 
    public static int gcd(int a, int b) {
	
	    while (b!=0) {
	    	int r = a%b;
	    	a = b;
		    b= r;
	    }
	    return a;
	    }
}