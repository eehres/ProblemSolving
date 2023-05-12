import java.util.*;
class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i = 0 ; i < numbers.length ; i++){
            answer+=numbers[i];
            if(answer>n)break;
        }
        Arrays.sort(numbers);
        int k = 0;
        if(answer<=n){
            for(int i = 0 ; i < numbers.length ; i++){
            if(answer>numbers[i]){
                k = numbers[i];
            }
        }
        }
        while(answer<n){
            answer+=k;
        }
        return answer;
    }
}