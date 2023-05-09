import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
 
class Solution {
    static boolean[] check;
    static String[] arr;
    static HashSet<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        arr = numbers.split("");
        check = new boolean[arr.length];
        dfs(0,"");
        return (int)set.stream().filter(Solution::isPrime).count();
    }
    static boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2;i<=(int)Math.sqrt(num);i++)
            if(num%i==0) return false;
        return true;
    }
    static void dfs(int depth,String str){
        if(depth >arr.length) return;
        for(int i=0;i< arr.length;i++){
            if(!check[i]){
                check[i]=true;
                set.add(Integer.valueOf(str+arr[i]));
                dfs(depth+1,str+arr[i]);
                check[i]=false;
            }
        }
    }
}
