class Solution {
    public String solution(int n) {
        String answer = "";
        int k = 1;
        while(k<=n){
            if(k%2==1){
                answer+="수";
            }else answer+="박";
            k++;
        }
        return answer;
    }
}