class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = ((Integer.toString(n, 2)).replace("0","")).length();
        n=n+1;
        while(true){
            if(((Integer.toString(n, 2)).replace("0","")).length()==count){
                answer = n;
                break;
            }else n++;
        }
        return answer;
    }
}