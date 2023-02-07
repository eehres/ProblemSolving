class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int i = score.length-1;
        while(i>0){
            answer = score[score.length-m-1]*m;
        }
        
        return answer;
    }
}