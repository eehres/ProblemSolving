import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer>stack = new Stack<>();
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0 ; i < progresses.length ; i++){
            progresses[i] = (100-progresses[i])%speeds[i]==0?(100-progresses[i])/speeds[i]:(100-progresses[i])/speeds[i]+1;
        }
        stack.push(progresses[0]);
        int max = progresses[0];
        for(int i = 1 ; i < progresses.length ; i++){
            if(max>=progresses[i]){
                stack.push(progresses[i]);
            }else{
                max = progresses[i];
                list.add(stack.size());
                stack.clear();
                stack.push(progresses[i]);
            }
        }
            list.add(stack.size());
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}