import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int arr[][] = new int[N][3];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0 ; i < N ; i++){
            StringTokenizer st  = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]) return o1[2]-o2[2];
                return o1[1]-o2[1];
            }
        });

        pq.add(arr[0][2]);

        for(int i = 1 ; i < N ; i++){
            if(pq.peek() <= arr[i][1]) pq.poll();
            pq.add(arr[i][2]);
        }
        System.out.println(pq.size());
        br.close();

        }
    }

