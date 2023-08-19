using System;

public class Solution {
    public int solution(string myString, string pat) {
        int answer = 0;
        if(myString.ToUpper().Contains(pat.ToUpper())==true){
            answer=1;
        }
        return answer;
    }
}