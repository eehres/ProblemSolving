import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        long []dice = new long[6];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0 ; i < 6 ; i++){
            dice[i] = Long.parseLong(st.nextToken());
        }
        long diceMin[] = new long[3];
        diceMin[0] = Math.min(dice[0],dice[5]);
        diceMin[1] = Math.min(dice[1],dice[4]);
        diceMin[2] = Math.min(dice[2],dice[3]);

        Arrays.sort(diceMin);

        diceMin[1]+=diceMin[0];
        diceMin[2]+=diceMin[1];

        long answer = 0;

        if(N==1){
            answer = Arrays.stream(dice).sum()-Arrays.stream(dice).max().getAsLong();
        }else {
            answer += diceMin[2] * 4 + diceMin[1] *( 8 * (N-2) + 4) + diceMin[0] * (5*Math.pow((N-2),2) + 4* (N - 2));
        }

             System.out.println(answer);
        }
    }

