using System;

public class Solution {
    public string solution(string my_string) {
        string answer = "";
        
        char[] charArr = my_string.ToCharArray();
        Array.Reverse(charArr);
        
        for(int i=0; i<charArr.Length; i++){
            answer += charArr[i];
        }
        return answer;
    }
}