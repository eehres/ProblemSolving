class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        for(int i = 0 ; i < babbling.length ; i++){
            for(int j = 0 ; j < str.length ; j++){
            if(babbling[i].contains(str[j]+str[j])){
                continue;
            }else if(babbling[i].contains(str[j])){
                babbling[i]=babbling[i].replace(str[j],"1");
            }
        }
            if(babbling[i].matches("^[0-9]*$")){
                answer++;
            }
        }
        return answer;
    }
}