import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int arr[] = new int[n+1];
        Arrays.fill(arr,1);
        arr[0] = 0;
        for(int j = 0 ; j < lost.length ; j++){
            arr[lost[j]]=-1;
        }
        for(int i = 0 ; i < reserve.length ; i++){
            if(arr[reserve[i]]==-1){
                arr[reserve[i]]=1;
            }else arr[reserve[i]]=2;     
        }
        
        for(int i = 1; i < arr.length-1 ; i++){
            if(arr[i]==2&&arr[i+1]==-1){
                arr[i]=1;
                arr[i+1]=1;
            }else if(arr[i+1]==2&&arr[i]==-1){
                arr[i]=1;
                arr[i+1]=1;
            }
        }
        answer = (int)Arrays.stream(arr).filter(x->x>=1).count();
        return answer;
    }
}