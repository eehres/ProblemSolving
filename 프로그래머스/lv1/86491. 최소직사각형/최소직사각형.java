class Solution {
    public int solution(int[][] sizes) {
        int xMAX = 0;
        int yMAX = 0;
        for(int i = 0 ; i < sizes.length ; i++){
                if(sizes[i][0]<sizes[i][1]){
                    int temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }
            if(sizes[i][0]>xMAX) xMAX = sizes[i][0];
            if(sizes[i][1]>yMAX) yMAX = sizes[i][1];
        }
        return xMAX*yMAX;
    }
}