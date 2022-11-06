import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
        Stack<Character>stack = new Stack<>();
        int result = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]=='('){
                if(arr[i+1]==')'){
                    result+=stack.size();
                    i++;
                }else stack.push('(');
            }else if(arr[i]==')'){
                stack.pop();
                result++;
            }
        }
        System.out.println(result);

    }
}