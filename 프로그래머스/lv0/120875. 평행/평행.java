import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        ArrayList<Double> list = new ArrayList<>();
        for(int i = 0 ; i < dots.length ; i++){
            for(int j = i+1 ; j < dots.length ; j++){
            double k = (double)(dots[j][1]-dots[i][1])/(dots[j][0]-dots[i][0]);
            if(list.contains(k)){
                answer = 1;
                break;
            }else list.add(k);
        }
            if(answer == 1){
                break;
            }
        }
        return answer;
    }
}