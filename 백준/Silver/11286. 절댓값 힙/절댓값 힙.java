import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((n1,n2)->{
            int num1 = Math.abs(n1);
            int num2 = Math.abs(n2);
            if(num1 == num2)
                return n1>n2 ? 1 : -1;
            else 
                return num1-num2;
        });
        for(int i = 0 ; i < N ; i++){
            int j = Integer.parseInt(br.readLine());
            if(j == 0){
                if(queue.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(queue.poll());
                
            }else{
                queue.add(j);
            }
        }
    }
}