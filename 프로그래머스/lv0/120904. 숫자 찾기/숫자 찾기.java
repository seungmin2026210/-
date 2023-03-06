class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] numstr = Integer.toString(num).split("");
        for(int i=0; i<numstr.length;i++) {
        	if(Integer.toString(k).equals(numstr[i])) {
        		answer=i+1;
        		break;
        	} else {
        		answer=-1;
        	} 
        	
        }
        return answer;	
    }
}