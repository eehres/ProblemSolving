import java.util.*;
class Solution {
    public String[] solution(String myString) {        
        myString = myString.replaceAll("x+"," ");
        if(myString.charAt(0)==' '){
            myString = myString.substring(1,myString.length());
        }
        String[] answer = myString.split(" ");
        
        Arrays.sort(answer);
        return answer;
    }
}