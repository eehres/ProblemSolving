class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 1;
        for(int i = 0 ; i < is_prefix.length() ; i++){
            if((my_string.length()<=i)||(my_string.charAt(i)!=is_prefix.charAt(i))){
                answer = 0;
                break;
            }
        }
        return answer;
    }
}