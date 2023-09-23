using System;

public class Solution {
    public double solution(int a, int b, int c) {
        double answer = 0;
       
        double tmp1 = a+b+c;
        double tmp2 = (a*a) + (b*b) + (c*c);
        double tmp3 = Math.Pow(a, 3) + Math.Pow(b, 3) + Math.Pow(c, 3);
        
        if( a == b && b==c ) {
            answer = tmp1 * tmp2 * tmp3;
        } else if(a==b&&b!=c||a==c&&c!=b||a!=b&&b==c){
            answer = tmp1*tmp2;
        } else {
            answer = tmp1;
        }
        return answer;
    }
}