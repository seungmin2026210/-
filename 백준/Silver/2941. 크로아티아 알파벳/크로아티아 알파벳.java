import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] str = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String N = scanner.nextLine();
		
		for (int i=0; i<str.length; i++) {
			if(N.contains(str[i])) {
				N = N.replace(str[i], "a");
			}
		}
		System.out.println(N.length());
	}
}