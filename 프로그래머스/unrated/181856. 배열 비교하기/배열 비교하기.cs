using System;

public class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        bool A = arr1.Length == arr2.Length;
        
        if(A==true){
           
            int arr1Sum = 0;
            int arr2Sum = 0;
            for(int i=0; i<arr1.Length;i++){
                arr1Sum += arr1[i] ;
                arr2Sum += arr2[i] ;
            } 
            
            if(arr1Sum<arr2Sum){
                answer = -1;
            } else if (arr2Sum<arr1Sum){
                answer = 1;
            } else {
                answer = 0;
            }
            
        } else {
            
            if(arr1.Length <arr2.Length){
                answer = -1;
            } else {
                answer =1;
            }
            
        }
        
        return answer;
    }
}