import java.util.Scanner;
class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = 0; i<n ; i++){
            String ox = sc.next();
            int point = 0;
            int sum = 0;
            for(int j=0;j<ox.length();j++){
                if(ox.charAt(j)=='O'){
                    point+=1;
                    sum+=point;
                }else point=0;
            }
            System.out.println(sum);
        }
		
	}
}
