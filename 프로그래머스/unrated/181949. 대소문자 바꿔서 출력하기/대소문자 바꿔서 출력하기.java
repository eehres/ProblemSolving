import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        String a = sc.next();
        for(int i = 0 ; i < a.length() ; i++){
            if('a'<= a.charAt(i) && a.charAt(i)<='z'){
                answer += String.valueOf((char)(a.charAt(i)-32));
            }else if('A'<= a.charAt(i) && a.charAt(i)<='Z'){
                answer += String.valueOf((char)(a.charAt(i)+32));
            }
        }
        System.out.println(answer);
    }
}