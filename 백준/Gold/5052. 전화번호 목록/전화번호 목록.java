import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while (T > 0) {
            int N = Integer.parseInt(br.readLine());
            String[] phoneNumber = new String[N]; 

            for (int i = 0; i < N; i++) {
                phoneNumber[i] = br.readLine();
            }
            Arrays.sort(phoneNumber);

            if (check(N, phoneNumber)) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
            T--;
        }

        bw.flush();
        bw.close();
        br.close();
    }
    
    public static boolean check(int N, String[] phoneNumber) {
        for (int i = 0; i < N - 1; i++) {
            if (phoneNumber[i + 1].startsWith(phoneNumber[i])) {
                return false;
            }
        }
        return true;
    }

}

