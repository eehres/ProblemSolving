import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String answer = "";
        HashMap<String,Integer> hm = new HashMap<>();
        String[] day = today.split("\\.");
        int currentDay = totalDay(day,0);
        for(int i = 0 ; i<terms.length ; i++){
            hm.put(""+terms[i].charAt(0), Integer.valueOf(terms[i].substring(2,terms[i].length())));
        }
        for(int i = 0 ; i < privacies.length ; i++){
            int term = hm.get(""+privacies[i].charAt(privacies[i].length()-1));
            String[]arr = privacies[i].substring(0,privacies[i].length()-2).split("\\.");
                if(currentDay>totalDay(arr,term)-1){
                    answer+=""+(i+1);
                    answer+=" ";
                }
            }

        return Stream.of(answer.split(" ")).mapToInt(Integer::parseInt).toArray();
}
    public static int totalDay(String[]arr,int term){
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1])+term;
        int day = Integer.parseInt(arr[2]);
        return (year*12*28)+(month*28)+day;
    }
}