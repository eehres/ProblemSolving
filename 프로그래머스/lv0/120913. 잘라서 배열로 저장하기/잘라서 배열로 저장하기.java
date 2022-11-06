import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String>list = new ArrayList<>();
        String str = ""+my_str.charAt(0);
        for(int i = 1 ; i < my_str.length() ; i++){
            if(i%n==0){
                list.add(str);
                str=""+my_str.charAt(i);
            }else{
                str+=""+my_str.charAt(i);
            } 
        }
        if(str.length()!=0){
            list.add(str);
        }
        String answer[] = list.toArray(new String[list.size()]);
        return answer;
    }
}