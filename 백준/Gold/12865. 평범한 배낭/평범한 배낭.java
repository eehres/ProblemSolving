import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][]dp = new int[N+1][K+1];

        int[]w =new int[N+1];
        int[]v = new int[K+1];

        for(int i=1;i<=N;i++) {
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i]= Integer.parseInt(st.nextToken());

        }


        for(int i=1;i<=N;i++) {
            for(int j=1;j<=K;j++) {
                dp[i][j] = dp[i-1][j]; 
                if(j - w[i]>=0) { 
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]); 
                }
            }
        }

        System.out.println(dp[N][K]);

    }

}

