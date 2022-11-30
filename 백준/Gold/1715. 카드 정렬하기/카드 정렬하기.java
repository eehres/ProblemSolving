import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while (N > 0) {
            int num = Integer.parseInt(br.readLine());
            pq.add(num);
            N--;
        }
        int sum = 0;

        while (pq.size()>1) {
                int a = pq.poll();
                int b = pq.poll();
                
                sum+=a+b;
                pq.add(a+b);
        }
        System.out.println(sum);
    }
}

