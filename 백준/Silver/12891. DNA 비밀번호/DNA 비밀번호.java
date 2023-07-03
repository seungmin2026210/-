import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    
	static int S,P,answer;
	
	static String DNA;
	
	// DNA 문자열
	static char[] dna = {'A','C','G','T'};
	
	static HashMap<Character,int[]> hashMap = new HashMap<Character, int[]>();
    
    public static void main(String[] args) throws IOException {
		// DNA 문자열 = 모든 문자열에 등장하는 문자가 ‘A’, ‘C’, ‘G’, ‘T’인 문자열
		// 부분문자열에 ‘A’ 는 1개 이상, ‘C’는 1개 이상, ‘G’는 1개 이상, ‘T’는 0개 이상이 등장해야 비밀번호로 사용가능
		// 부분문자열이 등장하는 위치가 다르다면 부분문자열이 같다고 하더라도 다른 문자열로 취급
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 문자열의 길이
		S = Integer.parseInt(st.nextToken());
		
		// 부분 문자열의 길이 
		P = Integer.parseInt(st.nextToken());
		
		//입력받을 문자
		DNA = br.readLine();
		
		st = new StringTokenizer(br.readLine());
		
		for(char c : dna) {
			/* dna 문자 , {현재 카운트 , 최소조건 }
			 첫 번째 요소는 현재 카운트 값이므로 초기상태에서는 아무 카운트가 되지 않아 0으로 초기화
			 최소조건은 Integer.parseInt(st.nextToken())을 통해 입력받음 */
			hashMap.put(c, new int[] {0, Integer.parseInt(st.nextToken())});
		}
		
		// P만큼 자른 문자열을 카운트하고 isFull()을 이용해 조건을 만족하는지 체크 
		for(int i=0; i<P; i++) {
			/* 문자열 "CCTGGATT"를 순회하며, 각 문자가 A, C, G, T인지 확인하고 해당하는 카운트를 증가
			   문자 'C'가 2번 등장하므로 hashMap.get('C')[0]를 2로 업데이트
			   문자 'T'가 2번 등장하므로 hashMap.get('T')[0]를 2로 업데이트
			 */
			hashMap.get(DNA.charAt(i))[0]++;
		}
		
		if(isFull()) answer++;
		
		
		/* hashMap.get(DNA.charAt(i)) => hashmap 의 DNA.charAt(i)를 불러온다.
		 인덱스를 1씩 증가시키면서 가장 왼쪽 문자를 삭제하고 가장 오른쪽 문자는 추가한다.
		 카운트를 0으로 초기화 하지 않고 첫 번째 요소의 카운트 값을 1으로 감소시킨다.
		 
		 예를 들어 CCTGGATTG의 경우 "CCTGGATT"를 확인한 뒤 "CTGGATTG"를 확인 할 때,
		 첫 번째 C문자가 제거 되었기 때문에 카운트 값을 1 감소시키는 것 
		 */ 
		for(int i=0; i<S-P; i++) {
			hashMap.get(DNA.charAt(i))[0] -= 1;
			hashMap.get(DNA.charAt(i+P))[0] += 1;
			
			if(isFull()) answer++;
		}
		System.out.println(answer);
	}

	public static boolean isFull() {
		for(char c:dna) {
			/* for문에서 입력받은 DNA문자를 한문자씩 가져와서 
			 hashMap.get(c)[0] = c의 첫번째 요소를 가져옴
			 hashMap.get(c)[1] = c의 두번째 요소를 가져옴
			 
			 예를들어 
			 
			 9 8
			CCTGGATTG
			2 0 1 1  
			에서 A의 최소조건은 '2'이지만 hashMap.get('A')[0]는 1이므로 최소 조건보다 작음
			  
			 첫 번째 요소가 두 번째 요소보다 작다면 false 를 return
			 = DNA 문자열이 최소 조건을 만족하지 않는 경우 */
			if(hashMap.get(c)[0] < hashMap.get(c)[1]) {
				return false;
			}
		}
		//DNA 문자열이 최소 조건을 만족하지 않는 경우
		return true;
	}
}
