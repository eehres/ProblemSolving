import java.util.Scanner;

public class Main
{
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
		int count = 0;
		int number = N;
		
		while (true) {
		    number = (number % 10) * 10 + (number / 10 + number % 10) % 10;
		    count++;
		    if (number == N) break;
		}
		System.out.println(count);
	}
}