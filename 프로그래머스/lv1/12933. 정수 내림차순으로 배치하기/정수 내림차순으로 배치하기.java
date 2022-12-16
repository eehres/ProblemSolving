import java.util.*;
class Solution {
    public long solution(long n) {
        String s = Long.toString(n);
        String[]arr = s.split("");
        Arrays.sort(arr,Collections.reverseOrder());
        long answer = Long.parseLong(String.join("",arr));
        return answer;
    }
}