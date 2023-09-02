using System;

public class Solution {
    public string[] solution(string[] names) {
        
        string[] answer;
        
        if(names.Length%5==0){
          answer = new string[names.Length/5];
        } else{
          answer = new string[names.Length/5+1];
        }
        
        int index=0;
        
        for(int i=0; i<names.Length;i++){
            if(i==0 || i%5==0){
                answer[index] = names[i];
                index++;
            }
        }
        
        return answer;
    }
}