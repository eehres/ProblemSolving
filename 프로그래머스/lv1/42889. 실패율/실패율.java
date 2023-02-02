import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] arr = new int[N+1]; //도달한 유저의 수를 저장
        double[] arr1 = new double[N+1]; //실패율을 저장
        double[] arr2 = new double[N+1]; //실패율을 저장, 비교용
        
        for(int i = 0 ; i < stages.length ; i++){
            if(stages[i]<N+1){
                arr[stages[i]]++;//스테이지에 도달한 유저의 수
            }
        }
        int len = stages.length;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i]!=0){
            arr1[i]=(double)arr[i]/len;
            len-=arr[i];
            }else {
                arr1[i]=0;
            }
            arr2[i]=arr1[i];
        }
        Arrays.sort(arr1);
        int index = 0;
        for(int i =  arr1.length-1 ; i >0 ; i--){
            for(int j = 1 ; j < arr2.length ; j++){
            if(arr2[j]==arr1[i]){
                answer[index++]=j;
                arr2[j] = -10;
                break;
            }
        }
        }
        return answer;
    }
}