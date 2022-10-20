class Solution {
    public String solution(String my_string, int num1, int num2) {
        char c = my_string.charAt(num1);
        StringBuilder answer = new StringBuilder(my_string);
        answer.setCharAt(num1, my_string.charAt(num2));
        answer.setCharAt(num2, c);

        return answer.toString();
    }
}