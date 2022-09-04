import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        
        long[]arr = new long[num1+1];
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 1;i<=num1 ; i++){
            arr[i]=arr[i-1]+Integer.parseInt(st.nextToken());
        }
        for(int j = 0 ; j<num2 ; j++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(arr[b]-arr[a-1]);
        }
        
        

    }
}