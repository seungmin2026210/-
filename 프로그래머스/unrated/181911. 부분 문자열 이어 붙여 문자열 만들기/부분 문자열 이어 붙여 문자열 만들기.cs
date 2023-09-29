using System;

public class Solution {
    public string solution(string[] my_strings, int[,] parts) {
        string answer = "";
        
        for(int i=0; i<parts.GetLength(0); i++){
            int a = parts[i, 0];
            int b = parts[i, 1];
            
            answer += my_strings[i].Substring(a, b-a+1);
        }
        return answer;
    }
}