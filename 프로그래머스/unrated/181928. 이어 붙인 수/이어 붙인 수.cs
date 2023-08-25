using System;

public class Solution {
    public int solution(int[] num_list) {

        int a =0;
        int b =0;
        
        foreach ( int i in num_list){
            if(i%2==0) {
              a = (a*10)+i;
            } else {
              b = (b*10)+i;
            }
        }
        
        return a+b;
    }
}