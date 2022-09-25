import java.util.Scanner;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            int count = 0;
            if(n==0) break;
            boolean [] prime = new boolean[n*2+1];
        
        for(int i = 0; i<prime.length ; i++){
            prime[i] = true;
        }
             for(int i = 2; i<Math.sqrt(n*2+1)+1 ; i++){
            if (prime[i]){
                for(int j = i+i;j<(n*2+1);j+=i){
                    prime[j]=false;
                }
            }
        }
            for(int i = n+1; i<n*2+1 ; i++){
            if(i>1 && prime[i]==true){
                count++;
            }
        }
        System.out.println(count);
        }
		
	}
}
