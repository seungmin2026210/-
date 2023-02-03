class Solution {
    public String[] solution(String my_str, int n) {
       int str_length = (my_str.length()+n-1)/n;
       String[] answer = new String[str_length];
       
       for(int i=0; i<str_length; i++) {
           answer[i] = i==(str_length-1) ? my_str.substring(i*n,my_str.length()) : my_str.substring(i*n,(n*(i+1)));
       }      
       return answer;
   }
}