import java.util.stream.Stream;
class Solution {
    public int[] solution(int[] arr) {
        String str = "";
        for(int i = 0 ; i < arr.length ; i++){
            String str2 = ""+arr[i]+",";
            str += str2.repeat(arr[i]);
        }
        int[] answer = Stream.of(str.split(",")).mapToInt(Integer::parseInt).toArray();
        return answer;
    }
}