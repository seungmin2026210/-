using System;

public class Solution {
    public string solution(string my_string, int num1, int num2) {

        char[] arr = my_string.ToCharArray();
        char tmp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = tmp;
        
        string answer = string.Concat(arr);
        return answer;
    }
}