using System;

public class Solution {
    public string solution(string my_string, int n) {
        string answer = "";

        Char[] answerArr = my_string.ToCharArray();
        
        for (int i=0 ; i< answerArr.Length; i++){
            
            for(int j=0; j<n; j++){
              answer += answerArr[i]; 
            }

        }
        return answer;
    }
}
