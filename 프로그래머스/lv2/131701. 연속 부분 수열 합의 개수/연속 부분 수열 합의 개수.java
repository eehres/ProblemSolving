import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int []arr = new int[elements.length*2];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = elements[i%elements.length];
        }
        HashSet<Integer>hs = new HashSet<>();
        int start = 1;
        while(start<=elements.length){
            for(int i = 0 ; i < elements.length ; i++){
                int sum = 0;
                for(int j = i ; j<i+start ; j++){
                    sum+=arr[j];
                }
                hs.add(sum);
            }
            start++;
        }
        answer=hs.size();
        return answer;
    }
}