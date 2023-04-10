import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer>hm = new HashMap<>();
        String[] answer = new String[players.length];
        for(int i = 0 ; i < players.length ; i++){
            hm.put(players[i],i);
            answer[i] = players[i];
        }
        for(int i = 0 ; i < callings.length ; i++){
            int index = hm.get(callings[i]);
            hm.replace(callings[i],index-1);
            hm.replace(answer[index-1],index);
            answer[index] = answer[index-1];
            answer[index-1] = callings[i];
        }
        return answer;
    }
}