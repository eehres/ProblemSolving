import java.util.Scanner;

class Main{
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
        
        String str = sc.next();
        char []ch = str.toCharArray();
        int sum = 0;
        
        for(int i : ch){
            
            sum += i-'0';
            
        }
        
        System.out.print(sum);
}
}
