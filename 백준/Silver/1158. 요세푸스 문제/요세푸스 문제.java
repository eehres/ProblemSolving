import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer>queue = new LinkedList<>();

        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }
        sb.append("<");

        while(!queue.isEmpty()){
            for(int i = 0 ; i < K ; i++){
                if(i==K-1){
                    sb.append(queue.poll()+", ");
                }else{
                    queue.add(queue.poll());
                }
            }
        }
        sb.delete(sb.length()-2,sb.length());
        sb.append(">");
        System.out.println(sb);
    }
}

