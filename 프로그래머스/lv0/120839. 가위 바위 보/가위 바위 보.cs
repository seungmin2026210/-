using System;

public class Solution {
    public string solution(string rsp) {
        string answer = "";
        
        for(int i=0; i<rsp.Length; i++){
            string tmp = rsp.Substring(i,1);
            if(tmp=="2"){
                answer += "0";
            } else if (tmp=="0"){
                answer += "5";
            } else {
                answer += "2";
            }
        }
        return answer;
    }
}