import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int answer = 0;
        for(int i : nums){
            hash.put(i,0);
        }
        if(hash.size()<=(nums.length/2)){
            answer = hash.size();
        }else answer = (nums.length/2);
        return answer;
    }
}