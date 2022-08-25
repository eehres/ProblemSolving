import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        
        int N = sc.nextInt();
        int sum = 0;
        
    for(int i = 0 ; i < N ; i++){
        int number = sc.nextInt();
        if(number==0){
            stack.pop();
        }else stack.push(number);
    }
    for(int j : stack){
        sum+=j;
    }
        System.out.println(sum);
}
}