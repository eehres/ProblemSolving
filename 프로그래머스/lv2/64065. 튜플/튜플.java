import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.substring(1,s.length()-2);
        s = s.replace("{","");
        String[] arr = s.split("},");
        Arrays.sort(arr,(String s1,String s2)->s1.length()-s2.length());
        LinkedHashSet<Integer>hs = new LinkedHashSet<>();
        for(int i = 0 ; i <arr.length ; i++){
            if(arr[i].length()>1){
                String [] num = arr[i].split(",");
                for(int j = 0 ; j < num.length ; j++){
                    hs.add(Integer.parseInt(num[j]));
                }
            }else{
                hs.add(Integer.parseInt(arr[i]));
            }
        }
        int[] answer = hs.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}