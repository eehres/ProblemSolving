import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int sum = 0;
        int [] arr = new int[M];
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0 ; i < N ; i++){
            sum = sum + (Integer.parseInt(st.nextToken())%M);
            arr[sum%M]++;
        }
        long result = arr[0];
        
        for(int i = 0 ; i < M ; i++){
            result = result + (long)arr[i]*(arr[i]-1)/2;
        }
        System.out.println(result);
    }
}