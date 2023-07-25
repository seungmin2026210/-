using System;

public class Solution {
    public string solution(string my_string, string letter) {
        string answer = "";
        string[] tmp = my_string.Split(letter);
        
        for(int i=0; i<tmp.Length; i++){
            answer += tmp[i];
        }
        
        return answer;
    }
}