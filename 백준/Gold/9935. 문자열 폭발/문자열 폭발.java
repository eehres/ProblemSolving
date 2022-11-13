import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        String bomb = br.readLine();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (sb.length() >= bomb.length()) {
                if (sb.substring(sb.length()-bomb.length(), sb.length()).equals(bomb)) {
                    sb.delete(sb.length()-bomb.length(), sb.length());
                }
            } else continue;
        }
        System.out.println(sb.length() ==0 ? "FRULA" : sb);
    }
}
