using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public string[] solution(string my_string) {
        string[] answer = my_string.Trim().Split(" ");
        answer = answer.Where(x => !string.IsNullOrEmpty(x)).ToArray();
        return answer;
    }
}