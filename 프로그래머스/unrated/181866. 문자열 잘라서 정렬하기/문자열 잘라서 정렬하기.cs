using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public string[] solution(string myString) {
        string[] answer = myString.Split('x');
        
        //공백제거
        answer = answer.Where(x => !string.IsNullOrEmpty(x)).ToArray();
        Array.Sort(answer);
        return answer;
    }
}