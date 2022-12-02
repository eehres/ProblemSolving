import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int cnt = 0;
            Queue<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                queue.add(new int[] {i,Integer.parseInt(st.nextToken())});
            }

            while (true) {
                int arr[] = queue.remove();
                boolean check = true;

                for (int q[] : queue) {
                    if(q[1] > arr[1]) {
                        check = false;
                        break;
                    }
                }

                if(check) {
                    cnt++;
                    if(arr[0] == M) break;
                }else {
                    queue.add(arr);
                }
            }
            System.out.println(cnt);
        }
    }
}