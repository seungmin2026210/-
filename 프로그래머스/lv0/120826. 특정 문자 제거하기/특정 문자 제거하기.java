class Solution {
    public String solution(String my_string, String letter) {
    	String answer = "";
    	String[] strArr = my_string.split("");
    	
    	for(int i=0; i<strArr.length;i++) {
    		if(!strArr[i].equals(letter)) {
    			answer=answer+strArr[i];
    		}
    	}
    	 return answer;
    }
}