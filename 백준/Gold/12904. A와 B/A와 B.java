import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuffer sb = new StringBuffer(br.readLine());


        while (s.length() < sb.length()) {
            if (sb.charAt(sb.length() - 1) == 'A') {
                sb.deleteCharAt(sb.length() - 1);
            } else if (sb.charAt(sb.length() - 1) == 'B') {
                sb.deleteCharAt(sb.length() - 1);
                sb.reverse();
            }
        }
        if(sb.toString().equals(s)){
            System.out.println("1");
        }else System.out.println("0");

    }
}
