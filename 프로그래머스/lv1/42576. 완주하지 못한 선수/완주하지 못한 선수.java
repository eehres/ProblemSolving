import java.util.*;
import java.io.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer>hash=new HashMap<>();
        for(String str : participant){
            hash.put(str,0);
        }
        for(String str : participant){
            hash.put(str,hash.get(str)+1);
        }
        for(String str : completion){
            hash.put(str,hash.get(str)-1);
        }

        for( String key : hash.keySet() ){
            if(hash.get(key)!=0){
                 answer = String.format(key);
            }
   
}
        return answer;
    }
}