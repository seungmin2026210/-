import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int count = 0; 
		//그룹단어 개수
		
		for(int i=1; i<=N; i++) {
			String M = scanner.next();
			
			boolean[] arr = new boolean[26];
			//알파벳(a~z)만큼 배열 생성
			
			boolean tmp = true; 
			//그룹단어인지 체크
			
			for(int j=0; j<M.length();j++) {
				
				int index = M.charAt(j)-'a';
				
				if(arr[index]) {
					//만약 이전에 사용을 한 적이 있는 문자인경우
					
					if(M.charAt(j)!=M.charAt(j-1)) {
						//그 중에서도 이전 문자와 연속되지 않는다면
						tmp=false; //그룹단어가 아님
						break;
					}
				} else {
					//이전에 사용 한 적이 없는 문자라면
					arr[index]=true;
				}
			}
			if(tmp) count++;
		}
		System.out.println(count);
	}
}
