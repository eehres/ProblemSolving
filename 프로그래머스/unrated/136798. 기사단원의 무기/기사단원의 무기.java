class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int k = 1 ; k <= number ; k++){
            int count = 0;
            for(int i = 1 ; i*i<=k ; i++){
            if(i*i==k){
                count++;
            }else if(k%i == 0){
                count+=2;
            }
        }
            if(count>limit){
                count = power;
            }
            answer+=count;
        }
        
        return answer;
    }
}