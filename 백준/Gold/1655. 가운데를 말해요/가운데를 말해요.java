import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer>max = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer>min = new PriorityQueue<>();

        while(N>0){
            int num = Integer.parseInt(br.readLine());
            if(max.size() == min.size()){
                max.add(num);
                if(!min.isEmpty()&&max.peek()>min.peek() ){
                    min.add(max.poll());
                    max.add(min.poll());
                }
            }else{
                min.add(num);
                if(max.peek()>min.peek()){
                    min.add(max.poll());
                    max.add(min.poll());
                }
            }
            sb.append(max.peek()+"\n");
            N--;
        }
        System.out.println(sb);
    }

}

