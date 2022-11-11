import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0 ; i< N ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int max = 0;
        for(int i = 1 ; i <= N ; i++){ 
            if(i==1){ 
                max = arr[arr.length-i];
            }else {
                if(max<=arr[arr.length-i]*i){
                    max = arr[arr.length-i]*i;
                }
            }
        }
        System.out.println(max);

    }
}
