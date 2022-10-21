import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        ArrayList <Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < my_string.length() ; i++){
            if('0'<=my_string.charAt(i) && '9'>=my_string.charAt(i)){
                list.add(my_string.charAt(i)-'0');
            }
        }
        int [] answer = list.stream().mapToInt(x->x).toArray();
        Arrays.sort(answer);
        return answer;
    }
}