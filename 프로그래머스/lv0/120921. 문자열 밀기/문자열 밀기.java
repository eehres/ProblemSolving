class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        while(!A.equals(B) && answer!=A.length()){
            A = A.charAt(A.length()-1)+A.substring(0,A.length()-1);
            answer++;
        }
        if(answer==A.length()){
            answer=-1;
        }
        return answer;
    }
}