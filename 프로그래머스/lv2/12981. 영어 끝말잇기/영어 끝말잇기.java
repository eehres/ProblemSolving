import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        int number = 1; //틀린 사람
        boolean check = true;
        ArrayList<String>list = new ArrayList<>();
        list.add(words[0]);
        char lastWord = words[0].charAt(words[0].length()-1);
        for(int i = 1 ; i < words.length ; i++){
            number++;
            char startWord = words[i].charAt(0);
            if(list.contains(words[i])||lastWord!=startWord){
                check = false;
                break;
            }
                list.add(words[i]);
                lastWord = words[i].charAt(words[i].length()-1);
        }
        System.out.print(list);
        if(check == true && number==words.length){
            answer[0] = 0;
            answer[1] = 0;
            return answer;
        }
        
        answer[0] = number%n==0?n:number%n;
        answer[1] = number%n==0?number/n:number/n+1;
        return answer;
    }
}