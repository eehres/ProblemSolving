import java.util.Scanner;
class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int result = 1;
        
        while(n>i){
            i+=6*result;
            result++;
        }
		System.out.println(result);
	}
}
