class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int count = 1;
        for(int i = 0 ; i < cipher.length() ; i++){
            if(count==code){
            answer += cipher.charAt(i);
            count=1;
                continue;
                }
            count++;
        }
        return answer;
    }
}