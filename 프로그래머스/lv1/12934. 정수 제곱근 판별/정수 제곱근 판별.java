class Solution {
    public long solution(long n) {
        long answer = (long)Math.pow((long)Math.sqrt(n),2)==n? (long)Math.pow(Math.sqrt(n)+1,2) : -1;
        return answer;
    }
}