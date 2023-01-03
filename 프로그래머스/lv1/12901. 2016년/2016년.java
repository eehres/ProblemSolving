class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String arr[] = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int day = 0;
        //1일 금 8일 금요일
        for(int i = 1 ; i < a ; i++){
            switch(i){
                case 1 :
                    day+=31;
                    break;
                case 2 :
                    day+=29;
                    break;
                case 3 :
                    day+=31;
                    break;
                case 4 :
                    day+=30;
                    break;
                case 5 :
                    day+=31;
                    break;
                case 6 :
                    day+=30;
                    break;
                case 7 :
                    day+=31;
                    break;
                case 8 :
                    day+=31;
                    break;
                case 9 :
                    day+=30;
                    break;
                case 10 :
                    day+=31;
                    break;
                case 11 :
                    day+=30;
                    break;
                case 12 :
                    day+=31;
                    break;
                default:
                    break;
            }
        }
        day+=b;
        day= day%7;
        answer = arr[day];
        return answer;
    }
}