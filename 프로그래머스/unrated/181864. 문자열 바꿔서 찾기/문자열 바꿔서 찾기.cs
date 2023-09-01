using System;

public class Solution {
    public int solution(string myString, string pat) {
        int answer = 0;
        myString = myString.Replace("A","X").Replace("B","A").Replace("X","B");
        if(myString.Contains(pat)==true) answer=1;
        return answer;
    }
}