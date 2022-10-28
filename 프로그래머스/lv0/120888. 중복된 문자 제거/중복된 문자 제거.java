class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] c = my_string.toCharArray();
		for (char x : c) {
			if (!answer.contains(String.valueOf(x))) answer += x;
		}
		
		return answer;
    }
}