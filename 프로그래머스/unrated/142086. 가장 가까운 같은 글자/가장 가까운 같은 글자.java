class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            int k = -1;
            if(i == 0){
                answer[i] = k;
                continue;
            }else{
                for(int j = 0 ; j < i ; j++){
                    if(s.charAt(j)==c){
                        k = i-j;
                    }
                }
            }
            answer[i] = k;
        }
        return answer;
    }
}