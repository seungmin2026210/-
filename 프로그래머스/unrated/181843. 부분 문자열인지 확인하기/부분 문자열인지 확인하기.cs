using System;

public class Solution {
    public int solution(string my_string, string target) {
        int answer = 0;

        if(my_string.Contains(target) == true) answer =1;
        
        return answer;
    }
}