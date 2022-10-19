class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(int i = 0 ; i < my_string.length() ; i++){
            String s = String.valueOf(my_string.charAt(i));
            if(letter.equals(s)){
                continue;
            }else answer+=s;
        }
        return answer;
    }
}