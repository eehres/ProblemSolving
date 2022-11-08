import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0 ; i < N ; i++){
            int x = sc.nextInt();
            if(x == 0){
                if(heap.isEmpty()){
                    sb.append("0\n");
                }else{
                    sb.append(heap.poll()+"\n");
                }
            }else{
                heap.add(x);
            }
        }

        System.out.println(sb.toString());

    }
}