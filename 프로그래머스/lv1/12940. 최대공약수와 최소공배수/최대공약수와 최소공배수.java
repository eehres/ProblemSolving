class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int k = 1;
        int i = 2;
        int min = Math.min(n,m);
        while(i<=min){
            if(n%i==0 && m%i == 0){
               k*=i;
               n/=i;
               m/=i;
            }else{
                i++;
            }
            
        }
        answer[0] = k;
        answer[1] = n*m*k;
        return answer;
    }
}