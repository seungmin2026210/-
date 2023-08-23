using System;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer;
        
        if(num_list.Length%n==0){
         answer = new int[num_list.Length/n];   
        } else {
          answer = new int[(num_list.Length/n)+1];  
        }

        int index =0;
        for(int i=0;i<num_list.Length; ){
            answer[index] = num_list[i];
            index++;
            i = i+n;
        }
        return answer;
    }
}