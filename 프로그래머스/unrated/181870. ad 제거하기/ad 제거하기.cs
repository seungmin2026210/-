using System;
using System.Collections.Generic; 

public class Solution {
    public List<string> solution(string[] strArr) {
        List<string> list = new List<string>();
        
        for(int i=0; i<strArr.Length; i++){
            if(strArr[i].Contains("ad")){
                continue;
            }
            list.Add(strArr[i]);
        }
        return list;
    }
}