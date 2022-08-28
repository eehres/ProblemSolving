import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			int sum = 0;
            int j = i;
			
			while(j != 0) {
				sum += j % 10;
				j /= 10;
			}
            
			if(sum + i == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}