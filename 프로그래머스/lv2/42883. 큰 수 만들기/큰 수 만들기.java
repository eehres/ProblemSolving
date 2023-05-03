class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int n = 0;
        for (int i = 0; i < number.length() - k; i++) {
            int max = 0;
            for (int j = index; j <= i + k; j++) {
                int current = number.charAt(j) - '0';
                if (max < current) {
                    max = current;
                    n = j;
                }
            }
            sb.append(max);
            index = n + 1;
        }
        return sb.toString();
    }
}