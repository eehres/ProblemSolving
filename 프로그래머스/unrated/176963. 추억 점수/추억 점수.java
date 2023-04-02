import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String,Integer>hm = new HashMap<>();
        for(int i = 0 ; i < name.length ; i++){
            hm.put(name[i],yearning[i]);
        }
        for(int i = 0 ; i < photo.length ; i++){
            int point = 0;
            for(int j = 0 ; j < photo[i].length ; j++){
                if(hm.containsKey(photo[i][j])){
                    point+=hm.get(photo[i][j]);
                }
            }
            answer[i] = point;
        }
        return answer;
    }
}