import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        int check = goal.length;
        Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2));
        for(int i = 0 ; i < goal.length ; i++){
            if(queue1.size()>0&&goal[i].equals(queue1.peek())){
                queue1.poll();
                check--;
            }else if(queue2.size()>0&&goal[i].equals(queue2.peek())){
                queue2.poll();
                check--;
            }
        }
        if(check==0){
            answer="Yes";
        }
        return answer;
    }
}