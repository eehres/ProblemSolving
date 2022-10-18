import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], 0);
        }
        int count = 0;
        for (Integer i : map.keySet()) {
            map.put(i, count++);
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(map.get(arr[i]) + " ");
        }

        bw.flush();
        bw.close();
    }
}