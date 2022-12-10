import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int [] arr = new int[200];
        for(int i = 0 ; i < lines.length ; i++){
            for(int j = lines[i][0]+100 ; j < lines[i][1]+100 ; j++){
                arr[j]++;
            }
        }
        return (int)Arrays.stream(arr).filter(x->x>1).count();
    }
}