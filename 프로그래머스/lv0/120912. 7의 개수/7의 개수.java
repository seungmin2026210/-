class Solution {
    public int solution(int[] array) {
        int answer =0;
        
        for(int i=0; i<array.length; i++) {
        	String num = Integer.toString(array[i]);
        	String[] numArr = num.split("");
        	
        	for(int j=0;j<numArr.length;j++) {
        		if(numArr[j].equals("7")) {
        			answer++;
        		}
        	}
        }
    	return answer;	
	}
}