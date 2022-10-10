import java.io.*;
import java.util.*;

public class Main {
    static int n;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);
    }
    public static void DFS(int num, int k){
        if(k == n){
            if(isPrime(num)){
                System.out.println(num);
            }
            return;
        }
        for(int i = 1 ; i < 10 ; i++){
            if(i%2 == 0){
                continue;
            }
            if(isPrime(num * 10 + i)){
                DFS(num * 10 + i , k +1);
            }
        }
    }
    public static boolean isPrime(int n){
        for(int i = 2; i <= n/2 ; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
