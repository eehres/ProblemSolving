import java.util.stream.Stream;
import java.util.*;
class Solution {
    public String solution(String s) {
        int []arr = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        
        
        String answer = Integer.toString(arr[0]);
        answer += " "+arr[arr.length-1];
        return answer;
    }
}