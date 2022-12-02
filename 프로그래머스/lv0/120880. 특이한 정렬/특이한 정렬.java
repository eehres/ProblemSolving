import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        PriorityQueue<Integer>pq1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer>pq2 = new PriorityQueue<>();
        int[] answer = new int[numlist.length];
        for(int i : numlist){
            if(i<=n){
                pq1.add(i);
            }else pq2.add(i);
        }
        int index = 0;
        while(pq1.size()>0 && pq2.size()>0){
            if(Math.abs(pq1.peek()-n)>Math.abs(pq2.peek()-n)){
                answer[index] = pq2.poll();
            }else if(Math.abs(pq1.peek()-n)<Math.abs(pq2.peek()-n)){
                answer[index] = pq1.poll();
            }else if(Math.abs(pq1.peek()-n)==Math.abs(pq2.peek()-n)){
                answer[index] = pq2.poll();
            }
            index++;
        }
        while(pq1.size()>0){
            answer[index]=pq1.poll();
            index++;
        }
        while(pq2.size()>0){
            answer[index]=pq2.poll();
            index++;
        }
        return answer;
    }
}