using System;

public class Solution {
    public int solution(string num_str) {
        int answer = 0;
        
        char[] number = num_str.ToCharArray();
        
        for(int i=0; i<num_str.Length; i++){
           answer += (int)Char.GetNumericValue(number[i]);
        }
        
        return answer;
    }
}