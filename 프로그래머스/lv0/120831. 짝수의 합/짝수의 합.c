#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int sum = 0;
    
    for(;0<n;n--){
         if(n%2==0){
        sum+=n;
        }   
    }
    
    return sum;
}