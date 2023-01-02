class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)==' '){
                answer+=" ";
            }else if(s.charAt(i)+n<='Z'){
                answer+=(char)(s.charAt(i)+n);
            }else if('Z'<s.charAt(i)+n && s.charAt(i)+n<'a'){
                answer+=(char)(s.charAt(i)+n-26);
            }else if('a'<=s.charAt(i)&&s.charAt(i)+n<='z'){
                answer+=(char)(s.charAt(i)+n);
            }else{
                answer+=(char)(s.charAt(i)+n-26);
            
        }
        
    }
        return answer;
}
}
                               