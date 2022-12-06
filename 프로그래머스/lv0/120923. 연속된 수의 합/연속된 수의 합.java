class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int middle = total / num;
        int temp = total % num == 0 ? num / 2 : num / 2 - 1;

        int start = middle - temp;

        for (int i = 0; i < num; i++) {
            answer[i]= start + i; 
        }
        return answer;
    }
}