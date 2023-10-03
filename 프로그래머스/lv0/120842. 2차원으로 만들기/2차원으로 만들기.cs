using System;

public class Solution {
    public int[,] solution(int[] num_list, int n) {
        int[,] answer = new int[(num_list.Length/n), n];
        
        int x = 0;
        int y = 0;
        
        for(int i=0; i<num_list.Length; i++)
        {
            answer[x, y] = num_list[i];
            y++;
            if(y == n)
            {
                x++;
                y = 0;
            }
        }
        return answer;
    }
}