import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] arr = {"R","T","C","F","J","M","A","N"};
        HashMap<String,Integer>hm = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            hm.put(arr[i],0);
        }
        for(int i = 0 ; i < survey.length ; i++){
                int point;
            if(choices[i]<4){
                point = 4-choices[i];
                hm.put(""+survey[i].charAt(0),hm.get(""+survey[i].charAt(0))+point);
            }else if(choices[i]>4){
                point = choices[i]-4;
                hm.put(""+survey[i].charAt(1),hm.get(""+survey[i].charAt(1))+point);
            }    
        }
        answer+=(hm.get("R")>=hm.get("T"))?"R" :"T";
        answer+=(hm.get("C")>=hm.get("F"))?"C" :"F";
        answer+=(hm.get("J")>=hm.get("M"))?"J" :"M";
        answer+=(hm.get("A")>=hm.get("N"))?"A" :"N";
        return answer;
    }
}