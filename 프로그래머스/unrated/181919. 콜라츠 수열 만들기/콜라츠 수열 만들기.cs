using System.Collections.Generic;
using System;

public class Solution {
    public List<int> solution(int n) {
        List<int> answer = new List<int>();
        
        answer.Add(n);
        
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            answer.Add(n);
        }
        return answer;
    }
}