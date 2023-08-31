using System;

public class Solution {
    public int solution(string my_string, string is_suffix) {
        int answer = 0;
        if(my_string.EndsWith(is_suffix)==true) answer=1;
        return answer;
    }
}