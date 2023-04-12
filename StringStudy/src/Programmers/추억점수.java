package Programmers;

import java.util.Arrays;
import java.util.HashMap;

public class 추억점수 {
    public static void main(String[] args){
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        추억점수 T = new 추억점수();
        T.solution(name,yearning, photo);
    }
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> scoreMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            for (String s :photo[i]) {
                answer[i] += scoreMap.getOrDefault(s,0);;
            }
        }
        return answer;
    }
}
