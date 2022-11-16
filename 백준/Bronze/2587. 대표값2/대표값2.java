import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];

        for(int i = 0 ; i < 5 ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int average = Arrays.stream(arr).sum()/5;

        System.out.println(average);
        System.out.println(arr[2]);

    }

}