import java.util.*;

class Solution {
    
    final char[] words = {'A', 'E', 'I', 'O', 'U'};
    final int max_length = 5;
        
    public int solution(String word) {
        int answer = 0;
        
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<words.length; i++){
            dfs(list, String.valueOf(words[i]));
        }    
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(word)){
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
    
    void dfs(List<String> list, String str){
        if(str.length() > max_length) return;
        
        if(!list.contains(str)) list.add(str);
    
        for(int i=0; i<words.length; i++){
            dfs(list, str+words[i]);
        }
    }
}