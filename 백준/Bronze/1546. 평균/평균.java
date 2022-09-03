import java.util.Scanner;

class Main{
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int [] arr = new int[N];
        int max = 0;
        int sum = 0;
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
            if(max<arr[i]) max = arr[i];
        }
		System.out.println((float)(sum*100)/(n*max));
	}
}
