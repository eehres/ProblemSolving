import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Arrays.stream(sides).max().getAsInt();
        int min = Arrays.stream(sides).min().getAsInt();
        int k = 1;
        
        while(k<=max){
            if(k>max-min){
                answer++;
            }
            k++;
        }
        while(k<sides[0]+sides[1]){
            answer++;
            k++;
        }
        
        
        return answer;
    }
}