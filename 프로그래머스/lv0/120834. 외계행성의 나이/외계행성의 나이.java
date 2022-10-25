class Solution {
    public String solution(int age) {
        char arr[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String str = "" + age;
        String answer = "";
        for(int i = 0 ; i < str.length() ; i++){
            answer += arr[str.charAt(i)-'0'];
        }
        
        return answer;
    }
}