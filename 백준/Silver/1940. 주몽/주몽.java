import java.util.*;
import java.io.*; 

public class Main { 
	public static void main(String[] args) throws IOException { 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
		
        int [] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
		int count = 0;
        int startIndex = 0;
        int endIndex = N-1;

        while(startIndex < endIndex){
            if(arr[startIndex]+arr[endIndex] == M){
                count++;
                endIndex--;
                startIndex++;
            }else if(arr[startIndex]+arr[endIndex] > M){
                endIndex--;
            }else {
                startIndex++;
            }
        }

		System.out.println(count);
	} 
}
