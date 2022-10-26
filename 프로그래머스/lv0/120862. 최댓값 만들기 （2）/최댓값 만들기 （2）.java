import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = 0;
        if(numbers[0]*numbers[1]>numbers[numbers.length-1]*numbers[numbers.length-2]){
            answer = numbers[0]*numbers[1];
        }else answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        return answer;
    }
}