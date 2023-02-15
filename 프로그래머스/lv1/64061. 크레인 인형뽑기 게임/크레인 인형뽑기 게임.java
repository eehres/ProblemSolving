import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer>stack = new Stack<>();
        for(int j = 0 ; j < moves.length ; j++){
            for(int i = 0 ; i <board.length ; i++){
                if(board[i][moves[j]-1]!=0){
                    if(stack.size()>0&&(stack.peek()==board[i][moves[j]-1])){
                        stack.pop();
                        answer+=2;
                    }else{
                        stack.push(board[i][moves[j]-1]);
                    }
                    board[i][moves[j]-1] = 0;
                        break;
                    }
            }
        }
        
        return answer;
        }
        
    }
