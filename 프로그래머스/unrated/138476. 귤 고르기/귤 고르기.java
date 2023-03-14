import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < tangerine.length ; i++){
            hm.put(tangerine[i],hm.getOrDefault(tangerine[i],0)+1);
        }
        List<Integer> list = new ArrayList<>(hm.keySet());
        Collections.sort(list, (o1, o2) -> (hm.get(o2).compareTo(hm.get(o1))));
        for(Integer key : list){
            if(k==0){
                break;
            }else if(hm.get(key)<=k){
                k-=hm.get(key);
            }else{
                k=0;
            }
            answer++;
        }
        return answer;
    }
}