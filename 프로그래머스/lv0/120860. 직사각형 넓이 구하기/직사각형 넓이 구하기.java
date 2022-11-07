import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        Arrays.sort(dots, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
        int x = Math.abs(dots[3][0]-dots[0][0]);
        int y = Math.abs(dots[1][1]-dots[0][1]);
        int answer = x*y;
        return answer;
    }
}