using System;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = 1;
        
        for(int i = 1; i <= 10; i++)
        {
            tmp *= i;
            if(n <= tmp)
            {
                answer = tmp > n ? i-1 : i;
                break;
            }
        }
        return answer;
    }
}