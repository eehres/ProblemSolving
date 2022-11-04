import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char []arr = s.toCharArray();
        
        for(int i = 0 ; i < arr.length ; i++){
            char c = arr[i];
            boolean check = true;
            for(int j = 0 ; j < arr.length ; j++){
                if(i!=j){
                if(c==arr[j]){
                    check = false;
                    break;
                }
                }
            }
            if(check) answer+=c;
            
        }
        char arr1[] = answer.toCharArray();
        
        Arrays.sort(arr1);
        answer = String.valueOf(arr1);
        return answer;
               }
            
        
    }
