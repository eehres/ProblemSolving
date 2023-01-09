import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer>list = new ArrayList<>(); 
        int[] answer1 = {1,2,3,4,5};
        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[4];
        for(int i = 0 ; i < answers.length ; i++){
            if(answers[i]==answer1[i%answer1.length]){
                score[1]++;
            }
            if(answers[i]==answer2[i%answer2.length]){
                score[2]++;
            }
            if(answers[i]==answer3[i%answer3.length]){
                score[3]++;
            }
        }
        int max = Arrays.stream(score).max().getAsInt();
        for(int i=1;i<score.length;i++){
            if(score[i]==max){
                list.add(i);
            }
        }
        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}