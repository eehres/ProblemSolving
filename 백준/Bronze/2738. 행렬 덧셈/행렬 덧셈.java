
import java.util.*;
import java.io.*;
 
public class Main {	
    public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int arr[][] = new int[N][M];
        
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < M ; j++){
            arr[i][j]+= Integer.parseInt(st.nextToken());
        }
        }
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < M ; j++){
                arr[i][j]+= Integer.parseInt(st.nextToken());
                System.out.print(arr[i][j]+" ");
        }
            System.out.println();
        }
	}
}