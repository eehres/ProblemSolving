import java.util.Scanner;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array =new int [n];
        int max = -1000000;
		int min = 1000000;
    
        for(int i = 0 ; i<n ; i++){
            array[i] = sc.nextInt();
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.print(min+" "+max);

	}
}

