using System;

public class Solution {
    public string solution(string my_string, int[] indices) {
        
        char[] charArr = my_string.ToCharArray();
        
        for(int i=0; i<indices.Length; i++){
            int tmp = indices[i];
            charArr[tmp] = ' ';
        }
        
        string answer = new string(charArr).Replace(" ","");
        return answer;
    }
}