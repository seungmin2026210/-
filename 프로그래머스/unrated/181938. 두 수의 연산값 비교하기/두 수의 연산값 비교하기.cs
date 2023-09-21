using System;

public class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        string num = ""+a+b;
        int number = (int.Parse(num));

        if(number<(2*a*b)){
            answer = 2*a*b;
        } else {
            answer = number;
        } 
        
        return answer;
    }
}