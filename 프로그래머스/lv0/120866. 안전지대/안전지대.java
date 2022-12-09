class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][]arr = new int[board.length][board.length];
        
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board.length ; j++){
                if(board[i][j]==1){
                    isSafe(arr,i,j);
                }
        }
        
        }
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board.length ; j++){
            if(arr[i][j]==0) answer++;
        }
        }
        return answer;
    }
    public static int[][] isSafe(int[][]arr,int i, int j){
        for(int n = i-1 ; n <= i+1 ; n++){
            for(int m = j-1 ; m <= j+1 ; m++){
                if(n<0 || n>=arr.length || m<0 || m>=arr.length ){
                    continue;
                }else arr[n][m] = 1;
        }
        }
        return arr;
    }
}