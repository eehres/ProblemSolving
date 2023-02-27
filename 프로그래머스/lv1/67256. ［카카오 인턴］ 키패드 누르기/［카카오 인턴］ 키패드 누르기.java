class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int rNum = 10;
        int lNum = 12;
        for(int i = 0 ; i < numbers.length ; i++){
            if(numbers[i]==0){
                numbers[i]=11;
            }
            switch(numbers[i]%3){
            case 0:
                answer+="R";
                rNum = numbers[i];
                break;
            case 1:
                answer+="L";
                lNum = numbers[i];
                break;
            case 2:
                if(Math.abs(numbers[i]-rNum)/3+Math.abs(numbers[i]-rNum)%3>Math.abs(numbers[i]-lNum)/3+Math.abs(numbers[i]-lNum)%3){
                    lNum=numbers[i];
                    answer+="L";
                }else if(Math.abs(numbers[i]-rNum)/3+Math.abs(numbers[i]-rNum)%3<Math.abs(numbers[i]-lNum)/3+Math.abs(numbers[i]-lNum)%3){
                    rNum=numbers[i];
                    answer+="R";
                }else{
                    if(hand.equals("left")){
                        lNum=numbers[i];
                    }else if(hand.equals("right")){
                        rNum=numbers[i];
                    }
                    answer+=hand.substring(0,1).toUpperCase();
                }
                break;
            default:
                break;
        }
        }
        return answer;
    }
}