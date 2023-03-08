import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> reportList = new HashMap<>();
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < id_list.length ; i++){
            reportList.put(id_list[i],new HashSet<>());
            hm.put(id_list[i],i);
        }
        for(int i = 0 ; i < report.length ; i++){
            String[]list = report[i].split(" ");
            reportList.get(list[1]).add(list[0]);
        }
        for(int i = 0 ; i < id_list.length ; i++){
            HashSet<String> hs = reportList.get(id_list[i]);
            if(hs.size()>=k){
                for(String s : hs){
                    answer[hm.get(s)]++;
                }
            }
        }
        return answer;
    }
}