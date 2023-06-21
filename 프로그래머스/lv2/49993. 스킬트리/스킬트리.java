class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        int idx = 0;
        for(String str : skill_trees){
            int [] arr = new int [skill.length()];
            for(int i = 0 ; i < skill.length() ; i++){
                arr[i] = str.indexOf("" + skill.charAt(i));
                if(arr[i] == -1){
                    arr[i] = 100;
                }
            }
            boolean check = true;
            for(int i = 0 ; i < skill.length()-1 ; i++){
                if(arr[i] > arr[i+1]){
                    check = false;
                }
            }
            if(check){
                answer++;
            }
        }
        return answer;
    }
}