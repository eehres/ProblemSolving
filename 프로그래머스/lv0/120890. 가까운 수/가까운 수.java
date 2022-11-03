import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int gap = Math.abs(array[0]-n);
        int answer = array[0];
        for(int i=0;i<array.length ; i++){
            if(Math.abs(array[i]-n)<gap){
                    answer=array[i];
                    gap = Math.abs(array[i]-n);
            }
        }
        return answer;
    }
}