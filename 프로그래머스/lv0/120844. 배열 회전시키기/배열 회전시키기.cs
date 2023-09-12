using System;

public class Solution {
    public int[] solution(int[] numbers, string direction) {
        int[] answer = new int[numbers.Length];
        
        if(direction=="left"){
            for(int i=0; i<numbers.Length; i++){
                if(i-1 <0){
                    answer[numbers.Length-1] = numbers[0];
                } else {
                    answer[i-1] = numbers[i];
                }
            } 
        } else {
          for(int i=0; i<numbers.Length; i++){
              if(numbers.Length-1 <i+1){
                  answer[0] = numbers[numbers.Length-1];
              } else {
                  answer[i+1] = numbers[i];
              }
          }
        }
        return answer;
    }
}