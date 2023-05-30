import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        Map<String,String> map = new HashMap<>();
        int count = 0;
        for(int i = 0 ; i < record.length ; i++){
            String[]arr = record[i].split(" ");
            if(arr.length>2){
               map.put(arr[1],arr[2]);
               if(arr[0].equals("Change")){
                   count++;
               }
            }
        }
        
        String[] answer = new String[record.length-count];
        int index = 0;
        for(int i = 0 ; i < record.length ; i++){
            String[]arr = record[i].split(" ");
            if(arr.length>2){
                if(arr[0].equals("Enter")){
                    answer[index++] = map.get(arr[1])+"님이 들어왔습니다.";
                }
            }else{
                answer[index++] = map.get(arr[1])+"님이 나갔습니다.";
            }
            
        }
        return answer;
    }
}