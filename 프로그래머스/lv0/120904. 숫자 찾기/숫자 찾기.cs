using System;

public class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        string numString = num.ToString();
        string kString = k.ToString();
        
        if(numString.Contains(kString)) answer = numString.IndexOf(kString)+1;
        
        return answer;
    }
}