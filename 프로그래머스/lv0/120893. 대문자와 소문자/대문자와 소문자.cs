using System;

public class Solution {
    public string solution(string my_string) {
        string answer = "";
        
        for(int i=0; i<my_string.Length; i++){
            if(Char.IsLower(my_string[i])==true){
                answer += Char.ToUpper(my_string[i]);
            } else {
                answer += Char.ToLower(my_string[i]);
            }
        }
        return answer;
    }
}