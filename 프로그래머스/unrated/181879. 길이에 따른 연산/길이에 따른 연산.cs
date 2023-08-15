using System;

public class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        
        for(int i=0; i<num_list.Length; i++){
            if(11<=num_list.Length){
                answer +=num_list[i];
            } else {
                answer *=num_list[i];                
            }
        }
       if(11<=num_list.Length) answer -=1;
        
       return answer;
    }
}