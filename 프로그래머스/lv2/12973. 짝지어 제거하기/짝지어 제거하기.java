import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character>stack = new Stack<>();
        for(int i = 0 ; i<s.length() ; i++){
            if(stack.size()>0 && stack.peek()==s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.size()==0){
            answer=1;
        }

        return answer;
    }
}