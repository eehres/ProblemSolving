class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = {0,0};
        int num3 = num1*num2; //분모
        int denum3 = denum1*num2 + denum2*num1; //분자
        
        for(int i = 2 ; i <= num3 ; i++){
            if(denum3%i == 0 && num3 % i == 0){
                num3 /= i;
                denum3 /= i;
                i-=1;
            }
        }
        answer[0] = denum3;
        answer[1] = num3;
        return answer;
    }
}