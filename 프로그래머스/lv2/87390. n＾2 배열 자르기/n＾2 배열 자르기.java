import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];
        int x = (int)(left/(long)n);
        int y = (int)(left%(long)n);
        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = Math.max(x,y)+1;
            y++;
            if(y==n){
                x++;
                y=0;
            }
        }
        return answer;
    }
}