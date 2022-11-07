class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int m = i ; m <= j ; m++){
            String str = Integer.toString(m);
            String str2 = "[^"+k+"]";
            str = str.replaceAll(str2,"");
            answer+=str.length();
        }
        return answer;
    }
}