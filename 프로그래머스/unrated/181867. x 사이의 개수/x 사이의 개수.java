import java.util.*;
class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x");
        int len = arr.length;
        if(myString.charAt(myString.length()-1)=='x'){
            len+=1;
        }
        int[] answer = new int[len];
        for(int i = 0 ; i < arr.length ; i++){
            answer[i] = arr[i].length();
        }
        System.out.println(Arrays.toString(arr));
        return answer;
    }
}