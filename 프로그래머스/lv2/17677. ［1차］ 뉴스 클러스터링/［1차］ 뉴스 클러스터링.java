import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int count = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        ArrayList<String>list1 = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        for(int i=0;i<str1.length()-1;i++){
            if('a'<=str1.charAt(i)&&'z'>=str1.charAt(i)){
                if('a'<=str1.charAt(i+1)&&'z'>=str1.charAt(i+1)){
                list1.add(str1.substring(i,i+2));
            }
            }
        }
         for(int i=0;i<str2.length()-1;i++){
            if('a'<=str2.charAt(i)&&'z'>=str2.charAt(i)){
                if('a'<=str2.charAt(i+1)&&'z'>=str2.charAt(i+1)){
                list2.add(str2.substring(i,i+2));
            }
            }
        }
        for(String str : list1){
            if(list2.contains(str)){
                list2.remove(str);
                count++;
            }
        }
        if(count == 0 && (list1.size()+list2.size())==0)return 65536;
        System.out.print(((double)count/(double)(list1.size()+list2.size())));
        answer = (int)(((double)count/(double)(list1.size()+list2.size()))*65536);
        return answer;
    }
}