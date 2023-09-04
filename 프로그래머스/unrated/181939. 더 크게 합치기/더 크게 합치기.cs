using System;

public class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        string aString = a.ToString();
        string bString = b.ToString();
        string strAnswer1 = aString+bString;
        string strAnswer2 = bString+aString;
        
        if(Convert.ToInt32(strAnswer1)<Convert.ToInt32(strAnswer2)) {
            answer = Convert.ToInt32(strAnswer2);
        } else {
            answer = Convert.ToInt32(strAnswer1);
        }
        return answer;
    }
}