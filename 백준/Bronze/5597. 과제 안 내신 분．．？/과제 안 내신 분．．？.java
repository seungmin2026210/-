import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] StudentNum = new int[31];
		// 전체 학생의 Array
		// 배열은 31까지 만들지만 1~30까지만 값을 쓰면 됨!
		
		for(int i=1; i<=28; i++) {
			int Num=scanner.nextInt();
			StudentNum[Num]=1;
		} // 숙제를 낸 학생번호를 Num으로 받아 
		// StudentNum에 true의 의미로 1 을 넣어준다.
		
		for(int i=1; i<StudentNum.length;i++) {
			if(StudentNum[i]==0) {
				System.out.println(i);
			}
			
		}
	}
}
