using System;

public class Solution {
    public int solution(int[] num_list) {
        int answer = 0;   
        
        for(int i=0; i<num_list.Length; i++){
            int num = num_list[i];
            while(1<num){
                if(num%2==0){
                    num = num/2;
                    answer++;
                } else {
                    num = (num-1)/2;
                    answer++;
                }
            }
        }
        return answer;
    }
}