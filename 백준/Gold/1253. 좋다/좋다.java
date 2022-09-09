import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[N];
        int count = 0 ;
        
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        for(int j = 0 ; j < N ; j++){
            int startIndex = 0;
            int endIndex = N-1;
            
            while(startIndex < endIndex){
                if(arr[startIndex]+arr[endIndex] == arr[j]){
                    if( startIndex != j && endIndex != j ){
                        count++;
                        break;
                    }else if(startIndex == j){
                        startIndex++;
                    }else if(endIndex == j){
                        endIndex--;
                    }
                } else if(arr[startIndex]+arr[endIndex] < arr[j]){
                    startIndex++;
                }else endIndex--;
            }
        }
        System.out.println(count);
    }
}