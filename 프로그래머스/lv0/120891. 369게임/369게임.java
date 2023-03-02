class Solution {
    public int solution(int order) {
    	int answer = 0;
    	
    	String[] strArr = Integer.toString(order).split("");
    	
    	for(int i=0; i<strArr.length; i++) {
		if(Integer.parseInt(strArr[i])%3==0 && Integer.parseInt(strArr[i])!=0) {
    			answer++;
    		}
    	}
    	 return answer;
    }
}