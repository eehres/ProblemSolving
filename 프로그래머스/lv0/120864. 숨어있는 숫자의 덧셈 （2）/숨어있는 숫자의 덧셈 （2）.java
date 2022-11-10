class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string+"A";
        String str = "";
        int check = 0;
        for(int i = 0 ; i < my_string.length() ; i++){
            if('0'<=my_string.charAt(i) && '9'>=my_string.charAt(i)){
                str+=my_string.charAt(i);
                check = 1;
            }else{
                if(str.length()>=1){
                    answer+=Integer.parseInt(str);
                }
                str = "";
            }
        }
        if(check==0){
            answer = 0;
        }
        return answer;
    }
}