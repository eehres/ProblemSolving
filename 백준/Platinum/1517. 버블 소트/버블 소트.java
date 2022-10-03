import java.io.*;
import java.util.*;

public class Main {
    public static int[] arr, tmp;
    public static long result;
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        arr = new int[N+1];
        tmp = new int[N+1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 1; i<=N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        result = 0;
        mergetsort(1,N);
        System.out.println(result);
    }
    public static void mergetsort(int s, int e){
        if(e-s<1)return ;
        int m = s + (e-s)/2;
        mergetsort(s,m);
        mergetsort(m+1,e);
        for(int i = s ; i <= e ; i++){
            tmp[i] = arr[i];
        }
        int k = s;
        int index1 = s;
        int index2 = m+1;
        while(index1 <= m && index2 <= e){
            if(tmp[index1]>tmp[index2]){
                arr[k] = tmp[index2];
                result = result + index2 - k;
                k++;
                index2++;
            }else {
                arr[k] = tmp[index1];
                k++;
                index1++;
            }
            
        }
        while(index1 <= m){
            arr[k] = tmp[index1];
            k++;
            index1++;
        }
        while(index2 <= e){
            arr[k] = tmp[index2];
            k++;
            index2++;
        }
    }
    
}
