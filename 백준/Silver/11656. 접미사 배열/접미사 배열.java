import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String arr[] = new String[str.length()];
        int i = 0;
        
        while(i<str.length()){
            arr[i] = str.substring(i);
            i++;
        }

        Arrays.sort(arr);
        
        for(String s : arr){
        System.out.println(s);
        }

        
    }
}