import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int arr[] = new int[N];
        
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int result = sum(arr);
        
        System.out.print(result);
        
        
    }
    public static int sum(int [] arr){
        if(arr.length==0){
            return 0;
        }
        return Arrays.stream(arr).sum()+sum(Arrays.copyOfRange(arr,0, arr.length-1));
    }
}