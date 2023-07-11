class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] intArray =  new int[included.length];

        for(int i=0; i<included.length; i++){

            if(i == 0){
                 intArray[0] = a; 
            } else {
                intArray[i] = intArray[i-1] + d;
            }

            if(included[i] == true){
                answer += intArray[i];
            }
        }
        return answer;
    }
}