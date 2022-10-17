import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String i : s1){
            if(Arrays.asList(s2).contains(i)){
                answer+=1;
            }
        }
        return answer;
    }
}