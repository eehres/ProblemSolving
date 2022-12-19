import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1)return new int[]{-1};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr){
            pq.add(i);
        }
        int min = pq.poll();
        int[] answer = new int[pq.size()];
        int index = 0;
        for(int i : arr){
            if(i!=min){
                answer[index++] = i;
            }
        }
        return answer;
    }
}