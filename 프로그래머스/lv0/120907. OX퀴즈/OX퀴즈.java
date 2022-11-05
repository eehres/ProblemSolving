class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0 ; i < quiz.length ; i++){
            String[] str = quiz[i].split(" ");
            int check = 0;
            for(int j = 0 ; j < str.length ; j++){
                
                if(j==1){
                    if(str[j].equals("+")){
                        check+=Integer.parseInt(str[j+1]);
                    }else{
                        check-=Integer.parseInt(str[j+1]);
                    }
                    break;
                }else if(j==0){
                    check+=Integer.parseInt(str[j]);
                }
            }
            if(str[str.length-1].equals(""+check)){
                answer[i]="O";
            }else answer[i]="X";
        }
        return answer;
    }
}