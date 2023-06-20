import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        for(int i = 0 ; i < park.length ; i++){
            for(int j = 0 ; j < park[i].length() ; j++){
                if(park[i].charAt(j)=='S'){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        int tempX = answer[0];
        int tempY = answer[1];
        int x = answer[0];
        int y = answer[1];
        for(int i = 0 ; i < routes.length ; i++){
            String[]arr= routes[i].split(" ");
            if(arr[0].equals("E")){
                y = y+Integer.parseInt(arr[1]);
            }else if(arr[0].equals("S")){
                x = x+Integer.parseInt(arr[1]);
            }else if(arr[0].equals("W")){
                y = y-Integer.parseInt(arr[1]);
            }else if(arr[0].equals("N")){
                x = x-Integer.parseInt(arr[1]);
            }
            boolean check = true;
            if(0<=x && x< park.length){
                if(0<=y && y< park[0].length()){
                    for(int j = Math.min(tempX, x) ; j <= Math.max(tempX, x) ; j++){
                        for(int k = Math.min(tempY, y) ; k <= Math.max(tempY, y) ; k++){
                        if(park[j].charAt(k)=='X'){
                            check = false;
                            break;
                        }
                    }
                        if(!check) break;
                    }
                }else{
                    check = false;
                }
            }else{
                check = false;
            }
            if(check){
                tempX = x;
                tempY = y;
            }else{
                x = tempX;
                y = tempY;
            }
        }
        answer[0] = tempX;
        answer[1] = tempY;
        return answer;
    }
}