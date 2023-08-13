using System;

public class Solution {
    public int solution(int n, string control) {
        int answer = n;
        char[] my_char = control.ToCharArray();
        
        for(int i=0; i<my_char.Length; i++){
            switch ( my_char[i] ) 
            {
              case 'w': 
                 answer +=1; 
                 break; 
              case 's': 
                  answer -=1;  
                 break; 
              case 'd': 
                  answer +=10;  
                 break;       
              case 'a': 
                  answer -=10;  
                 break;   
            }
        }
        
        return answer;
    }
}