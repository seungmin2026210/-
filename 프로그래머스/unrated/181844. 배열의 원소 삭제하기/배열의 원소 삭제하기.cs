using System;
using System.Collections.Generic; 

public class Solution {
    public List<int> solution(int[] arr, int[] delete_list) {
        List<int> answer = new List<int>();
        
        for(int i=0; i<arr.Length; i++){
            int cnt = 0;
            for(int j=0; j<delete_list.Length; j++){
               if(arr[i]==delete_list[j]) cnt++;
            }
            if(cnt==0) answer.Add(arr[i]);
        }
        return answer;
    }
}