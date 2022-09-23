import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Integer arr [] = new Integer[str.length()];

        for(int i = 0 ; i < str.length() ; i++){
            arr[i] = Integer.parseInt(str.substring(i,i+1));
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i : arr){
            System.out.print(i);
        }
    }
}