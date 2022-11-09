import java.util.*;
class Solution {
    public String solution(String polynomial) {
        if(!polynomial.contains("+")){
            return polynomial;
        }
        polynomial = polynomial.replace(" ","");
        String answer = "";
        int xNum = 0;
        int Num = 0;
        StringTokenizer st = new StringTokenizer(polynomial, "+");
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            if(str.contains("x")){
                if(str.length()>=2){
                    str=str.substring(0,str.length()-1);
                    xNum+=Integer.parseInt(str);
                }else{
                    xNum+=1;
                }
            }else{
                Num+=Integer.parseInt(str);
            }
        }
        if(xNum==1){
            answer+="x";
            if(Num!=0){
                answer+=" + "+Num;
            }
        }else if(xNum==0){
            answer+=Num;
        }else if(Num==0){
            answer+=xNum+"x";
        }else {
            answer += xNum+"x + "+Num;
        }
        return answer;
    }
}