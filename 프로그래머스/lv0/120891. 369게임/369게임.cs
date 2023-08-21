using System;

public class Solution {
    public int solution(int order) {
        int answer = 0;
        
        while (0<order){
            if( (order%10)%3 ==0 && order % 10 !=0 ){
                answer++;
            }
            order /=10;
        }
        return answer;
    }
}