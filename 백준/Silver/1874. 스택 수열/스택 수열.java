import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        
        int num = 1;
        boolean result = true;
        StringBuffer bf = new StringBuffer();
        for(int i = 0 ; i<arr.length ; i++){
            
            if(arr[i]>=num){
                while(arr[i]>=num){
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }else{
                int n = stack.pop();
                if(n>arr[i]){
                    System.out.println("NO");
                    result = false;
                    break;
                }else{
                    bf.append("-\n");
                }
            }
           
        }
        if(result){
            System.out.println(bf.toString());
        }
    }
}