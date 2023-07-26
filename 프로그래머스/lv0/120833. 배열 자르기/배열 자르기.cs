using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        List<int> list = new List<int>();
        
        
        for(int i = num1; i <= num2; i++)
        {
            list.Add(numbers[i]);
        }        
        int[] answer = list.ToArray();
        
        return answer;
    }
}
