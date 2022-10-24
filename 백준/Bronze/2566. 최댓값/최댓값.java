import java.util.*;
import java.io.*;
 
public class Main {	
    public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int arr[][] = new int[9][9];
        int max = arr[0][0];
        int xIndex = 0;
        int yIndex = 0;
        
        for(int i = 0 ; i < 9 ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 9 ; j++){
            arr[i][j]= Integer.parseInt(st.nextToken());
            if(arr[i][j]>max){
                max = arr[i][j];
                xIndex = i;
                yIndex = j;
            }
        }
        }
        xIndex+=1;
        yIndex+=1;
            System.out.println(max);
            System.out.println(xIndex + " " + yIndex);
        }
	}
