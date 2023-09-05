using System;

public class Solution {
    public int[] solution(int[] arr) {

        int index = 0;
        for(int i=0; i<arr.Length; i++){
            index +=arr[i];
        }
        
        int[] answer = new int[index];
        
        int answerIndex = 0;
        
        for(int i=0; i<arr.Length; i++){
            for(int j=0; j<arr[i]; j++){
                answer[answerIndex] = arr[i];
                answerIndex++;
            }
        }
        
        return answer;
    }
}