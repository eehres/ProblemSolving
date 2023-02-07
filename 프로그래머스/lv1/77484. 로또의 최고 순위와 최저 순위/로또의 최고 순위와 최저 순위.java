class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0 ; //확실히 맞은 수
        int zeroCount = 0; 
        for(int i = 0 ; i < lottos.length ; i++){
            if(lottos[i]==0) zeroCount++;
            for(int j = 0 ; j < win_nums.length ; j++){
                if(lottos[i] == win_nums[j]) count++;
            }
        }
            answer[0] = 7-(count+zeroCount);
            answer[1] = 7-count;
        if(answer[0]==7) answer[0]=6;
        if(answer[1]==7) answer[1]=6;
        return answer;
    }
}