class Solution {
    public int solution(int hp) {

        // A 장군개미 공격력 5
        // B 병정개미 공격력 3
        // C 일개미 공격력 1
        // 사냥감의 체력 hp -- 23 여치 
        int A=hp/5;
        int B=(hp%5)/3;
        int C=((hp%5)%3)/1;
  
       int answer = A+B+C;
        
        return answer;
    }
}