class Solution {
       public static int solution(int[] common) {
        int answer = 0;
           
        int a = common[1]-common[0];

        if(a == common[2]-common[1] && a == common[common.length-1]-common[common.length-2]) { 
            answer = common[common.length-1] + a;
        } else { 
            answer = (common[common.length-1]/common[common.length-2])*common[common.length-1];
        }
        
        

        return answer;
    }
}