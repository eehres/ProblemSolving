import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        Deque<Node> deque = new LinkedList<>();
        
        for(int i = 0 ; i < N ; i++){
            int m = Integer.parseInt(st.nextToken());
            
            while(!deque.isEmpty() && deque.getLast().value > m){
                deque.removeLast();
            }
            deque.addLast(new Node(m, i));
            if(deque.getFirst().index <= i-L){
                deque.removeFirst();
            }
            bw.write(deque.getFirst().value + " ");
        }
        bw.flush();
        bw.close();
              
        }
    static class Node{
            public int value;
            public int index;
            
            Node(int value, int index){
                this.value = value;
                this.index = index;
            }
        }
    }

