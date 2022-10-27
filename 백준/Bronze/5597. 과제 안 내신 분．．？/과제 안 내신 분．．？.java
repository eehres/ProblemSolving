import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        boolean arr[] = new boolean[31];
        for(int i = 1 ; i <= 28 ; i++){
            int n = sc.nextInt();
            arr[n] = true;
        }
        for(int i = 1 ; i < 31 ; i++){
            if(arr[i]==false){
                System.out.println(i);
            }
        }
    }
}