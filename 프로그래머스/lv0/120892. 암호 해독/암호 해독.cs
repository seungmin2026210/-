using System;

public class Solution {
    public string solution(string cipher, int code) {
        string answer = "";
        
        char[] tmp = cipher.ToCharArray();
        
        for(int i=code-1; i<cipher.Length; ){
            answer += tmp[i].ToString();
            i+=code;
        }
        return answer;
    }
}