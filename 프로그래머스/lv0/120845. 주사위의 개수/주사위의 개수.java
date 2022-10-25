class Solution {
    public int solution(int[] box, int n) {
        int answer = (box[0]/n)*(box[1]/n);
        answer = answer*(box[2]/n);
        return answer;
    }
}