import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        StringTokenizer st = new StringTokenizer(s);
        Stack<Integer>stack = new Stack<>();
        while(st.hasMoreTokens()){
            String c = st.nextToken();
            if(!c.equals("Z")){
                answer+=Integer.parseInt(c);
                stack.push(Integer.parseInt(c));
            }else{
                if(!stack.empty()){
                answer-=stack.pop();
                }
            }
        }
        return answer;
    }
}