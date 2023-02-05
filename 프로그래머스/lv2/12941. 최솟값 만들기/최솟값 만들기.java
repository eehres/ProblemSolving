import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        //하나는 오름차순, 하나는 내림차순으로 해서 이중으로 하면 되지않나
        Arrays.sort(A);
        Arrays.sort(B);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i = 0 ; i < A.length ; i++){
            answer+=A[i]*B[A.length-i-1];
        }
        System.out.println("Hello Java");

        return answer;
    }
}