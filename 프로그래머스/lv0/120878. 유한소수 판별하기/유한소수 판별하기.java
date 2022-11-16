class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int min = Math.min(a,b);
        int i = 2;
        while(i<=min){
            if(a%i == 0 && b%i ==0){
                a/=i;
                b/=i;
            }
            i++;
        }
        while(b%2==0 || b%5==0){
            if(b%2==0){
                b/=2;
            }
            if(b%5==0){
                b/=5;
            }
        }
        if(b!=1){
            answer=2;
        }
        return answer;
    }
}