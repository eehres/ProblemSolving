class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int temp = 0;
        while(chicken>0){
            answer+=chicken/10;
            temp += chicken%10;
            chicken=chicken/10;
        }
        while(temp>=10){
            answer+=temp/10;
            temp=temp/10+temp%10;
        }
        return answer;
    }
}