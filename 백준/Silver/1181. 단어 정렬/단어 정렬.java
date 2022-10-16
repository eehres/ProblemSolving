import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];

        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.next();
        }
        String[] resultArr = Arrays.stream(arr).distinct().toArray(String[]::new);
        Arrays.sort(resultArr);
        Arrays.sort(resultArr, (s1, s2) -> s1.length() - s2.length());
        
        for(String i : resultArr){
            System.out.println(i);
        }
    }
}