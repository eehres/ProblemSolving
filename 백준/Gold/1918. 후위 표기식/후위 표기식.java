import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String str = br.readLine();
        for(int i=0; i<str.length(); i++) {
            char temp = str.charAt(i);
            if('A'<=temp && temp <= 'Z') {
                sb.append(temp);
            } else if(temp == '(') {
                stack.add(temp);
            } else if(temp == ')') {
                while(!stack.isEmpty()) {
                    if(stack.peek() == '(') {
                        stack.pop();
                        break;
                    }
                    sb.append(stack.pop());
                }
            } else {
                while(!stack.isEmpty() && priority(stack.peek()) >= priority(temp)) {
                    sb.append(stack.pop());
                }
                stack.add(temp);
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
    public static int priority(char temp) {
        if(temp == '(') return 0;
        else if(temp == '+' || temp == '-') return 1;
        else return 2;
    }
}