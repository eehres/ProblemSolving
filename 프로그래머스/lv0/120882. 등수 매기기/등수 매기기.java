import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        double[] average = new double[score.length];
        int[] answer = new int[score.length];
        for(int i = 0 ; i<score.length ; i++){
            average[i] = (double)(score[i][0]+score[i][1])/2;
        }
        for(int i = 0 ; i<score.length ; i++){
            double c = average[i];
            for(int j = 0 ; j<score.length ; j++){
            if(c<average[j]) answer[i]++;
        }
            answer[i]++;
        }
        return answer;
    }
}