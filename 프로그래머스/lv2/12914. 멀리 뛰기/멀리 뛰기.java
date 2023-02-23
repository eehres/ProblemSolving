class Solution {
    public long solution(int n) {
        long[] run = new long[2001];
        run[1] = 1;
        run[2] = 2;

        for (int i = 3; i <= n; i++) {
            run[i] = (run[i - 1] + run[i - 2]) % 1234567;
        }

        return run[n];
    }
}