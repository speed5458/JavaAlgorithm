package Programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args){

        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        Solution T= new Solution();

        T.solution(players, callings);
    }

    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        //순위
        HashMap<Integer, String> playerHash = new HashMap<>();
        //사람이름
        HashMap<String, Integer> playerHash2 = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerHash.put(i, players[i]);
            playerHash2.put(players[i], i);
        }
        for (int i = 0; i < callings.length; i++) {
            //현재 불린사람의 순위
            int PlayerIdx = playerHash2.get(callings[i]);
            //바뀔 사람의 이름
            String tempPlayerNm = playerHash.get(PlayerIdx-1);

            playerHash.put(PlayerIdx-1, callings[i]);
            playerHash.put(PlayerIdx, tempPlayerNm);
            playerHash2.put(callings[i], PlayerIdx-1);
            playerHash2.put(tempPlayerNm, PlayerIdx);
        }

        answer = new String[players.length];

        for (int i = 0; i < players.length; i++) {
            answer[i] = playerHash.get(i);
        }
        Arrays.stream(answer).forEach(s-> System.out.println(s.toString()));
        return answer;
    }

}
