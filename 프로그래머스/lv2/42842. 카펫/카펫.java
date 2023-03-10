class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int check = 1;
        while(true){
            if(yellow%check==0 && ((brown-2*check)/2)*(2+check)==brown+yellow){
                answer[0]=(brown-2*check)/2;
                answer[1]=2+check;
                break;
            }
            check++;
        }
        return answer;
    }
}