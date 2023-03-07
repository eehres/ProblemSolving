class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {50,50,0,0};
        for(int i = 0 ; i < wallpaper.length ; i++){
            if(wallpaper[i].contains("#")){
                if(answer[0]>i){
                    answer[0]=i;
                }
                if(answer[1]>wallpaper[i].indexOf("#")){
                    answer[1] = wallpaper[i].indexOf("#");
                }
                if(answer[2]<i){
                    answer[2]=i;
                }
                if(answer[3]<wallpaper[i].lastIndexOf("#")){
                    answer[3] = wallpaper[i].lastIndexOf("#");
                }
            }
        }
        answer[2]+=1;
        answer[3]+=1;
        return answer;
    }
}