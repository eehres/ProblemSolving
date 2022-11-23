import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer>stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 1 ; i <=N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1 ; i <=N ; i++){

            while(stack.size()>0){
                if(arr[stack.peek()]>=arr[i]){
                    bw.write(stack.peek()+" ");
                    break;
                }else{
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                bw.write("0 ");
            }
            stack.push(i);
        }
        bw.flush();
        bw.close();

        }
    }

