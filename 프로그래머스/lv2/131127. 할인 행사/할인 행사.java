class Solution {
       static public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        for(int i = 0 ; i < discount.length-9 ; i++) {
            boolean join = true;
            for(int j = 0;j < want.length ; j++) {
                int check = 0; 
                for(int k = i ; k < i+10 ; k++) {
                    if(discount[k].equals(want[j])) check++;
                }        
                if(check<number[j]) {
                    join = false;
                    break;
                }
            }
           if(join) answer ++;
        }
        return answer;
    }
}