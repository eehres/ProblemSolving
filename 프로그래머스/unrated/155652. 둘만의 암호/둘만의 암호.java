import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0 ; i < skip.length() ; i++){
            alphabet = alphabet.replace(""+skip.charAt(i),"");
        }
        String[] arr = alphabet.split("");
        if(index==0){
            return s;
        }
        for(int i = 0 ; i < s.length() ; i++){
            String str = ""+s.charAt(i);
            answer+=arr[(Arrays.asList(arr).indexOf(str)+index)%arr.length];
        }
        return answer;
    }
}