class Solution {
    public int[] solution(int n, int[] numlist) {
int[] tmp = new int [numlist.length]; // 몇개 담길 지 모르니 numlist의 크기와 같게 만들어줌
int count =0; // answer 배열의 개수를 셀 변수
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0) { // i번째 인덱스가 n의 배수이면
         tmp[count] = numlist[i] ;
             // numlist의 i번째 배열의 숫자를 tmp배열의 count 번째 배열에 넣을게 
              count++;
	}
        }
        
        int[] answer = new int [count];// count로 만들어야 할 인덱스의 숫자를 셌으니까
 
    for(int i=0; i<count; i++){
            answer[i]=tmp[i];
        }
        return answer;
    }
}
