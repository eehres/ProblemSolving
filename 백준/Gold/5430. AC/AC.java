import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while(T>0){
            String AC = br.readLine();
            String answer = "";
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(),"[],");
            ArrayDeque<Integer>deque = new ArrayDeque<>();
            for(int i = 0 ; i < n ; i++){
                deque.add(Integer.parseInt(st.nextToken()));
            }
            boolean right = true;
            for(int i = 0 ; i < AC.length() ; i++){
                if(AC.charAt(i) == 'R') {
                    right = !right;
                    continue;
                }else if(AC.charAt(i)=='D'){
                    if(right) {
                        if(deque.pollFirst() == null) {
                            answer = "error";
                            break;
                        }
                    }
                    else {
                        if(deque.pollLast() == null) {
                            answer = "error";
                            break;
                        }
                    }
                }
            }
            if(answer.equals("")){
                sb.append("[");
                if(right){
                    if(!deque.isEmpty()){
                        sb.append(deque.pollFirst());
                        while(!deque.isEmpty()){
                            sb.append(","+deque.pollFirst());
                        }
                    }
                }else {
                    if(!deque.isEmpty()){
                        sb.append(deque.pollLast());
                        while(!deque.isEmpty()){
                            sb.append(","+deque.pollLast());
                        }
                    }

                }
                sb.append("]\n");
            }else sb.append(answer+"\n");
            T--;
        }

        System.out.println(sb+"\n");

        }
    }

