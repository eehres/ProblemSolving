class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(i==0){
                answer += (""+s.charAt(i)).toUpperCase();
            }else if(i>0&&s.charAt(i-1)==' '){
                answer += (""+s.charAt(i)).toUpperCase();
            }else if(i>0&&s.charAt(i-1)!=' '){
                answer += (""+s.charAt(i)).toLowerCase();
            }
        }
        return answer;
    }
}