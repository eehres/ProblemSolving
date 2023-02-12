import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        
        for(String x : X.split("")){
            arr1[Integer.parseInt(x)]++;
        }
        for(String y : Y.split("")){
            arr2[Integer.parseInt(y)]++;
        }
        for(int i = 9 ; i>= 0 ; i--){
            while(arr1[i]>0 && arr2[i]>0){
                sb.append(i);
                arr1[i]--;
                arr2[i]--;
            }
        }
        if((sb.toString()).equals(""))return "-1";
        if((sb.toString()).charAt(0)=='0')return "0";
        
        return sb.toString();
        
    }
}