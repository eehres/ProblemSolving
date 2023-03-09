class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for(int i = 0 ; i < targets.length ; i++){
            for(int j = 0 ; j < targets[i].length() ; j++){ 
                String s = ""+targets[i].charAt(j);
                int push = 101;
                for(String str : keymap){
                    if((push>str.indexOf(s))&&str.indexOf(s)!=-1){
                        push = str.indexOf(s);
                    }
                }
                if(push==101){
                    answer[i]=-1;
                    break;
                }else{
                    answer[i]+=(push+1);
                }
            }
        }
        return answer;
    }
}