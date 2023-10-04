using System;
using System.Linq;
using System.Collections.Generic;

public class Solution {
    public string solution(string s) {
        string answer = "";
        
        char[] arr = s.ToCharArray();
        Array.Sort(arr);
        
        List<int> tmp = new List<int>();
        
        for(int i=0; i<s.Length; i++){
            if(s.Count(f => (f == arr[i])).Equals(1)){
                tmp.Add(i);
            }
        }
        
        for(int i=0; i<tmp.Count; i++){
            answer += arr[tmp[i]].ToString();
        }
        
        
        
        return answer;
    }
}