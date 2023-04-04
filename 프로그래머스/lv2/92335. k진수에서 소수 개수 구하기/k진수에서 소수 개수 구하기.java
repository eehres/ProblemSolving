class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String s = Integer.toString(n,k);
        String[]arr = s.split("0");
        for(int i = 0 ; i<arr.length ; i++){
            if(!arr[i].equals("")&&isPrime(Long.parseLong(arr[i]))){
                answer++;
            }
        }
        return answer;
    }
    public boolean isPrime(long a){
        if(a==1 ) return false;
        for(int i=2; i<=Math.sqrt(a); i++){
            if(a%i==0) return false;     
        }    
        return true;
        }
    }