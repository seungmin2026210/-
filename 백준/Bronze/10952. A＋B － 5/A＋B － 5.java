import java.util.Scanner;
public class Main {
  public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
			for (int i=1; 0<i;i++){
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if(a!=0 && b!=0) {
				System.out.println(a+b);
			} else if(a+b==0) {
				break;
			}
        }
 }
}