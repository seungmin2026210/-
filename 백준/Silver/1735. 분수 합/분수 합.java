import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        
        int a3 = a1*b2 + a2*b1;
        int b3 = b1*b2;
        
        int gcd = getGCD(a3,b3);
        System.out.println(a3/gcd +" "+b3/gcd);
        
	}
	
	//유클리드 호제법 (기약분수 만들기)
	public static int getGCD(int n, int m) {
		if(n%m==0) {
			return m;
		} else {
			return getGCD(m, n%m);
		}
	}
}