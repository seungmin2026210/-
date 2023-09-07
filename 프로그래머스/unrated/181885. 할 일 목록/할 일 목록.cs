using System;

public class Solution {
    public string[] solution(string[] todo_list, bool[] finished) {
        
        int cnt = 0;
        foreach(bool i in finished){
            if(i==false){
                cnt++;
            }
        }
        string[] answer = new string[cnt];
        
        int index =0;
        
        for(int i=0; i<finished.Length; i++){
            if(finished[i]!=true) {
                answer[index] = todo_list[i];
                index++;
            }
        }
        
        return answer;
    }
}