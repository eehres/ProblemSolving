import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] paper=new int[100][100];
	    int n=Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=90-Integer.parseInt(st.nextToken());
			for (int j = y; j < y+10; j++) {
				for (int k = x; k < x+10; k++) {
					paper[j][k]=1;
				}
			}
		}
		int answer=0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if(paper[i][j]==1) {
					answer+=1;
				}
			}
		}
		System.out.println(answer);
	}
}