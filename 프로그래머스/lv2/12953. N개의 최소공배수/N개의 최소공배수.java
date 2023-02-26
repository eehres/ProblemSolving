class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i = 1;i<arr.length;i++){
            int gcd = gcd(answer,arr[i]);
            answer = answer * arr[i] / gcd; //최소공배수 구하기
        }
        
        return answer;
    }
        public static int gcd(int a, int b){
        int x = Math.max(a,b);
        int y = Math.min(a,b);
        
        while(x % y != 0){
            int r = x % y; //나머지
            x = y;
            y = r;
        }
        
        return y; //유클리드 호제법으로 구한 최대공약수
    }
}
