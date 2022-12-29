class Solution {
    public int[] solution(int n) {
      
        
        int[] numArray = new int[n];
        int num =0;
        
        for(int i=1; i<=n;i++) {
			if(n%i==0) {
            numArray[num]=i;
                num++;
			}
          }
        
        int[] numArray2 = new int[num];
        for(int i=0;i<num;i++){
            numArray2[i]=numArray[i];
        }
        
        return numArray2;
    }
}