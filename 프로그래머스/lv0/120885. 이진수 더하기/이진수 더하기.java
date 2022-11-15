class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        if(bin1.equals("0") && bin2.equals("0")){
            return "0";
        }
        int a = 0;
        int b = 0;
        int k = 0;
        for(int i = bin1.length()-1 ; i >=0 ; i--){
            a += (bin1.charAt(i)-'0')*Math.pow(2,k);
            k++;
        }
        k = 0;
        for(int i = bin2.length()-1 ; i >=0 ; i--){
            b += (bin2.charAt(i)-'0')*Math.pow(2,k);
            k++;
        }
        int sum = a+b;
        while(sum>=1){
            answer = sum%2 + answer;
            sum/=2;
        }
        return answer;
    }
}