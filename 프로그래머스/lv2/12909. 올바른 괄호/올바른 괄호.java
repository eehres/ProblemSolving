import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character>stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(0)==')'){
                answer=false;
                break;
            }
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else{
                if(stack.size()>0){
                    stack.pop();
                }
            }
        }
        if(stack.size()>0){
            answer=false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}