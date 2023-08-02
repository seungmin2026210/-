using System;

public class Solution {
    public int solution(string my_string) {
        int answer = 0;
        
        char[] my_char = my_string.ToCharArray();
        
        for(int i=0; i<my_char.Length; i++){
            
            if(Char.IsDigit(my_char[i])){
                answer += (int)my_char[i]-48;
            }
        }
        return answer;
    }
}