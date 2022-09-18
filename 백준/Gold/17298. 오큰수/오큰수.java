import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int result[] = new int[N];
        String str[] = br.readLine().split(" ");
        
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        stack.push(0);
        
        for(int i = 1 ; i < N ; i++){
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                result[stack.pop()]=arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            result[stack.pop()]= -1;
        }
        for(int i : result){
            bw.write(i+" ");
        }
        bw.flush();
    }
}
