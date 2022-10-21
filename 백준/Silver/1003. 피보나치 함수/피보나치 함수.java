import java.util.*;
import java.io.*;
class Main{
    static int [][] arr = new int[41][2];
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;

        for(int i = 0 ; i < N ; i++){
            int K = Integer.parseInt(br.readLine());
            fibonacci(K);
            bw.write(arr[K][0] + " " + arr[K][1]+"\n");
        }
        bw.flush();
        bw.close();
    }
    public static int[] fibonacci(int n) {
        if (n > 1) {
            if(arr[n][0] == 0 || arr[n][1]==0){
                arr[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
                arr[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
            }
        }
        return arr[n];
    }
}