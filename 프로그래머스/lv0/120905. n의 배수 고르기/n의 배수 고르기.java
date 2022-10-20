import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : numlist){
            if(i%n == 0){
                list.add(i);
            }
        }
        int [] arr =list.stream().mapToInt(x->x).toArray();
        return arr;
    }
}