import java.util.Scanner;
public class Main {
    
 	public static boolean[][] arr;
	public static int min = 64;
	   
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		arr = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			
			//B는 검은색 W는 흰색
			String str = scanner.next();
			
			for(int j=0; j<M; j++) {
				
				//만약, str의 i번째 문자가 'w'(흰색)이면 참
				//아닌경우 (검은색) 거짓을 배열에 넣어둔다.
				if(str.charAt(j)=='W') {
					arr[i][j]= true;
				} else {
					arr[i][j]=false;
				}
			}
		}
		
		//체스판이 잘못 칠해져있는 경우 '최소'의 개수로 칠할 수 있는 부분을 찾아야함.
		//최소 크기가 8*8일 때 경우의 수가 1이기 때문에
		//각 세로, 가로별 길이에 -1을 해 준다.
		int NRow = N-7;
		int MCol = M-7;
		
		for(int i=0; i<NRow; i++) {
			for(int j=0; j<MCol; j++) {
				find(i, j);
			}
		}
		System.out.println(min);
	}
	
	public static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int cnt = 0;
		
		boolean check = arr[x][y];
		//첫 번째 칸의 색
		
		for(int i = x ; i < end_x ; i++) {
			for(int j = y ; j < end_y ; j++) {
				
				//만약 올바른 색이 아닌 경우 count 1 증가 
				if(arr[i][j] != check) {
					cnt++;
				}
				check = !check;
			}
			check = !check;
		}
		
		cnt = Math.min(cnt, 64 - cnt);
		min = Math.min(min, cnt);
	}
}
