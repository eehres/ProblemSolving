class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = (long)num;
        if(num==1) return 0;
        while(answer<=500 && n!=1){
            if(n%2 == 0){
                n/=2;
            }else{
                n=n*3+1;
            }
            answer++;
        }
        if(answer>500) return -1;
        return answer;
    }
}