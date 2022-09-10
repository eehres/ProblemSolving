import java.io.*;
import java.util.*;

public class Main {
    static int password[];
    static int checkPassword[];
    static int check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        
        int count = 0;
        check = 0;
        
        password = new int[4];
        checkPassword = new int[4];
        char arr[] = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0 ; i < 4 ; i++){
            checkPassword[i] = Integer.parseInt(st.nextToken());
            if(checkPassword[i] == 0){
                 check++;
            }
        }
        for(int i = 0 ; i < P ; i++){
            Add(arr[i]);
        }
        if(check == 4) count++;
        
        for(int i = P ; i < S ; i++){
            int j = i - P;
            Add(arr[i]);
            Remove(arr[j]);
            if(check == 4) count++;
        }
        System.out.println(count);
    }
        
        private static void Add(char c){
            switch(c){
                case 'A' :
                    password[0]++;
                    if(password[0] == checkPassword[0]){
                        check++;
                    }
                    break;
                case 'C' :
                    password[1]++;
                    if(password[1] == checkPassword[1]){
                        check++;
                    }
                    break;
                case 'G' :
                    password[2]++;
                    if(password[2] == checkPassword[2]){
                        check++;
                    }
                    break;
                case 'T' :
                    password[3]++;
                    if(password[3] == checkPassword[3]){
                        check++;
                    }
                    break;
            }
        }
    private static void Remove(char c){
            switch(c){
                case 'A' :
                    if(password[0] == checkPassword[0]){
                        check--;
                    }
                    password[0]--;
                    break;
                case 'C' :
                    if(password[1] == checkPassword[1]){
                        check--;
                    }
                    password[1]--;
                    break;
                case 'G' :
            
                    if(password[2] == checkPassword[2]){
                        check--;
                    }
                    password[2]--;
                    break;
                case 'T' :
                
                    if(password[3] == checkPassword[3]){
                        check--;
                    }
                    password[3]--;
                    break;
            }
        }
    }

