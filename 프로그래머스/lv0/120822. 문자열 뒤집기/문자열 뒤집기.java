class Solution {
    public String solution(String my_string) {
        
        StringBuffer sb = new StringBuffer(my_string);
        String reversedStr = sb.reverse().toString();
        
        String answer = reversedStr;
        return answer;
    }
}