import java.util.Scanner;
class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            int m = sc.nextInt();
            int sum = 0;
            int[]arr = new int[m];
            for(int j=0;j<m;j++){
                arr[j]=sc.nextInt();
                sum+=arr[j];
            }
            float avg=sum/m;
            float cnt = 0;
            for(int j=0;j<m;j++){
                if(arr[j]>avg){
                    cnt+=1;
                }
            }
            System.out.printf("%.3f%%\n",(cnt/m)*100);
        }
		
	}
}
