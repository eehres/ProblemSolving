import java.util.Scanner;
class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1;i<=n;i++){
            if(i<100){
                count+=1;
            }else{
                String num=Integer.toString(i);
                int check = 0;
                for(int j=0;j<num.length()-2;j++){
                    if((num.charAt(j+1)-num.charAt(j))==(num.charAt(j+2)-num.charAt(j+1))){
                        check+=1;
                    }else {
                        break;
                    }
                }
                if(check == num.length()-2){
                    count+=1;
                }
            }
        }
		System.out.println(count);
	}
}
