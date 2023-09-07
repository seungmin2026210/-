using System;

public class Solution {
    public string solution(string myString) {

        char[] charArr = myString.ToCharArray();
        
        for(int i=0; i<charArr.Length; i++){
            if(charArr[i]<108){
                charArr[i] = 'l';
            }
        }
        string answer = new string(charArr);
        return answer;
    }
}