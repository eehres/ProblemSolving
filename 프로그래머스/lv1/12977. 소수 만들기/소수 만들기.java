import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        
        boolean [] arr = new boolean[nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3]+1];
        arr[0] = arr[1] = true;
        
         for(int i=2;i<arr.length ;i++) {
        if(arr[i]) continue; 

        for(int j=2*i;j<arr.length; j+=i) {
            arr[j] = true;
        }
    }
        
        for(int i = 0 ; i < nums.length-2 ; i++){
            for(int j = i+1 ; j < nums.length-1 ; j++){
                for(int k = j+1 ; k < nums.length ; k++){
                    if(!arr[nums[i]+nums[j]+nums[k]]) answer++;
                }
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}