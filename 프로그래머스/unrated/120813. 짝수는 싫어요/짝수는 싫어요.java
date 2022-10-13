import java.util.*;
import java.io.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer>list = new ArrayList<>();
        
        for(int i = 1;i<=n ; i++){
            if(i%2==1){
                list.add(i);
            }
        }
        int[] arr = list.stream().mapToInt(i->i).toArray();

        return arr;
    }
}