class Solution {
    public int solution(String s) {
        int answer = 0;
        while(true){
        char x = s.charAt(0);
        int xCount = 0;
        int xNotCount = 0;
        int i;
        for(i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == x){
                xCount++;
            }else xNotCount++;
            if(xCount==xNotCount) break;
        }
            if(i<s.length()-1){
                s = s.substring(i+1);
                answer++;
            }else {
                answer++;
                break;
            }
        }
        return answer;
    }
}