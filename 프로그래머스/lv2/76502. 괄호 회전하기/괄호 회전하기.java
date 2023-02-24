import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int check = 0;
        String A = "[]";
        String B = "()";
        String C = "{}";
        while(check<s.length()){
            String str = s;
            for(int i = 0 ; i < str.length()/2 ; i++){
                s=s.replace(A,"");
                s=s.replace(B,"");
                s=s.replace(C,"");
            }
            check++;
            if(s.length()==0){
                answer++;
            }
            s = str.substring(1,str.length())+str.substring(0,1);
        }
        return answer;
    }
}