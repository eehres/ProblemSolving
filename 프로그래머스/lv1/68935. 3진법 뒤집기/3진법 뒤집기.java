class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = "";
        while(n>0){
            s=(n%3)+s;
            n/=3;
        }
        for(int i = 0 ; i<s.length();i++){
            answer+=(s.charAt(i)-'0')*Math.pow(3,i);
        }
        return answer;
    }
}