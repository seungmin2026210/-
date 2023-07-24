using System;

public class Solution {
    public int[] solution(int[] num_list) {

        int count1=0;
        int count2=0;

        for(int i=0; i<num_list.Length;i++){
            if(num_list[i]%2==0){
                count1++;
            } else count2++;}
            
         int[] answer = new int[] {count1,count2};
        
        return answer;
    }
}