import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int index;
        if(direction.equals("right")){
            index = 0;
            answer[0] = numbers[numbers.length-1];
            for(int i = 1 ; i<numbers.length ; i++){
                answer[i]=numbers[index];
                index++;
            }
        }else if(direction.equals("left")){
            index = 1;
            answer[answer.length-1] = numbers[0];
            for(int i = 0 ; i<numbers.length-1 ; i++){
                answer[i]=numbers[index];
                index++;
            }
        }
        
        return answer;
    }
}