import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        for(int i = 0 ; i < cities.length ; i++){
            cities[i]=cities[i].toLowerCase();
        }
        Queue<String> q = new LinkedList<String>();
        int answer = 0;
        if(cacheSize==0) return 5*cities.length;
        for(int i = 0 ; i < cities.length ; i++){
            if(q.size()<=cacheSize && q.contains(cities[i])){
                q.remove(cities[i]); //cache hit(q안에 존재할 때)
                q.add(cities[i]);
                answer+=1;
            }else if(q.size()<cacheSize){
                q.add(cities[i]);//cache miss(q안에 존재X)
                answer+=5;
            }else if(q.size()==cacheSize){
                q.poll();
                q.add(cities[i]);
                answer+=5;
            }
        }
        return answer;
    }
}