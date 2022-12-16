class Solution {
    boolean solution(String s) {
        boolean answer = (s.chars()
                .filter(c -> c == 'P' || c == 'p')
                .count()==s.chars()
                .filter(c -> c == 'Y' || c == 'y')
                .count());
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}