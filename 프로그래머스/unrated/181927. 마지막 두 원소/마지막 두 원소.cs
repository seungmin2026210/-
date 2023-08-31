using System;

public class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer = new int[num_list.Length+1];
        
        for(int i=0; i<num_list.Length; i++){
            answer[i] = num_list[i];
        }
        
        int number = num_list[num_list.Length-1] - num_list[num_list.Length-2];
        
        if(0 < number ){
            answer[answer.Length-1] = number;
        } else {
            answer[answer.Length-1] = answer[answer.Length-2]*2;
        }
        
        return answer;
    }
}