import java.util.*;
class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        while(true){
            if(Math.abs(a-b)==1 && Math.max(a,b)%2==0) break;
            answer++;
            a = a%2==0?a/2:a/2+1;
            b = b%2==0?b/2:b/2+1;
        }
        

        return answer;
    }
}