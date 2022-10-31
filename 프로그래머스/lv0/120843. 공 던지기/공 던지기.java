class Solution {
    public int solution(int[] numbers, int k) {
        int index = 0;
        int answer = 0;
        while(k>0){
            answer = numbers[index];
            index+=2;
            if(index>=numbers.length){
                index-=numbers.length;
            }
            k--;
        }
        return answer;
    }
}