import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int [][] arr = new int[N][2];
        
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 2 ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(arr, (o1,o2)->{
            if(o1[1]==o2[1]){
                return Integer.compare(o1[0],o2[0]);
            }else return Integer.compare(o1[1],o2[1]);
        });
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < 2 ; j++){
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        }
        
              
        }
