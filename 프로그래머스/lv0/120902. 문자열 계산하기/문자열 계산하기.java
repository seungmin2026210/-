class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] my_stringArr = my_string.split(" ");
        
        answer = Integer.parseInt(my_stringArr[0]);
	
        for(int i=1; i<my_stringArr.length; i++) {
        	if(i%2!=0) {
        		if(my_stringArr[i].equals("+")) {
        			answer += Integer.parseInt(my_stringArr[i+1]);
        			} else {
						answer -= Integer.parseInt(my_stringArr[i+1]);
					}
        	}
        }
        
        return answer;
    }
}