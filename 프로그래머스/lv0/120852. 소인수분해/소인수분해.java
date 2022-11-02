import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 2 ; i <= n ; i++){
            if(n%i==0){
                if(i==2){
                    list.add(i);
                }else if(isPrime(i)){
                    list.add(i);
                }
                n/=i;
            }
        }
        int []answer = list.stream().mapToInt(m->m).toArray();
        return answer;
    }
    public boolean isPrime(int k){
        boolean check = true;
        for(int i = 2 ; i < k ; i++){
            if(k%i == 0){
                check = false;
                break;
            }
        } 
        return check;
    }
}