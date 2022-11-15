import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] isNotPrime = new boolean[1000001];

        for(int i = 2 ; i <= 1000000 ; i++){
            if(!isNotPrime[i]){
                for(int j = i*2 ; j<=1000000 ; j+=i){
                    isNotPrime[j]=true;
                }
            }

        }

        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;
            boolean check = false;

            for(int i = 3 ; i <= N/2 ; i=i+2){
                if(!isNotPrime[i] && !isNotPrime[N-i]){
                    bw.write(N + " = " +i +" + "+(N-i)+"\n");
                    check = true;
                    break;
                }
            }
            if(!check){
                bw.write("Goldbach's conjecture is wrong.\n");
            }

        }
        bw.flush();
        bw.close();
    }

}