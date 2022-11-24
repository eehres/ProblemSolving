import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(")")){
                int count = 0;
                while(!stack.peek().equals("(")) {
                    String str = stack.pop();
                    if(str.equals("*")) {
                        int len = Integer.parseInt(stack.pop());
                        count += len;
                    }else {
                        count += 1;
                    }
                }
                stack.pop(); 
                int len = Integer.parseInt(stack.pop());
                count *= len;
                stack.push(String.valueOf(count));
                stack.push("*");
            }else{
                stack.push(arr[i]);
            }
        }

        int answer = 0;
        while(!stack.isEmpty()) {
            if(stack.peek().equals("*")) {
                stack.pop();
                answer += Integer.parseInt(stack.pop());
            }else {
                stack.pop();
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}

