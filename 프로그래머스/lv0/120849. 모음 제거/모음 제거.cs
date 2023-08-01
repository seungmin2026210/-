using System;

public class Solution {
    public string solution(string my_string) {
        string answer = "";
        char[] my_char = my_string.ToCharArray();
        
        for(int i=0; i<my_char.Length; i++){
            if(my_char[i]=='a'|| my_char[i]=='e'|| my_char[i]=='i' || my_char[i]=='o' || my_char[i]=='u') {
              continue;
            } else{
            answer +=my_char[i];                
            }

        }
        return answer;
    }
}