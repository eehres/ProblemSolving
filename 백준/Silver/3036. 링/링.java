import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ring1 = Integer.parseInt(st.nextToken());
        int temp1 = ring1;

        for(int i = 0 ; i < N-1 ; i++){
            int ring2 = Integer.parseInt(st.nextToken());
            int temp2 = ring2;
            int j = 2;
            while(j<=Math.min(ring1,ring2)){
                if(temp1 % j == 0 && temp2 % j == 0){
                    temp1 /= j;
                    temp2 /= j;
                }else j++;
            }

            System.out.println((temp1) + "/"+(temp2));
            temp1 = ring1;
        }
    }

}