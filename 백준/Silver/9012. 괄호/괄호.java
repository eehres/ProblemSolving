import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        int N = sc.nextInt();
        String str = sc.nextLine();

        for(int i = 0 ; i < N ; i++){
            str = sc.nextLine();
            String Answer = "YES";
            for(int j = 0 ; j < str.length() ; j++){
                char c = str.charAt(j);
                if(c == '('){
                    stack.push(c);
                }else if(stack.isEmpty()){
                    Answer = "NO";
                    break;
                }else stack.pop();
            }
            if(!stack.isEmpty()) {
                Answer = "NO";
            }
            System.out.println(Answer);
            stack.clear();
        }


    }
}

