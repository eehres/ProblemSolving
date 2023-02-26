import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        int k = 2;
        for(int i : arr){
            answer*=i;
        }
        while(answer>k){
            if(answer%k==0){
                answer/=k;
            }else{
                k++;
            }
        }

        return answer;
    }
}