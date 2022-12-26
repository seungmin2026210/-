class Solution {
    public int solution(int[] numbers) {
        int max = 0;
        int num =0;
        for(int i=0; i<=numbers.length;i++){
            for(int j=1; j<=numbers.length;j++){
                num=numbers[i]*numbers[j];
                if(num>=max){
                    max=num;
                }
            }
            }
        return max;
    }
}