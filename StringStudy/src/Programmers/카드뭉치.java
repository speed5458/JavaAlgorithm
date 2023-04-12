package Programmers;

import java.util.*;

public class 카드뭉치 {
    public static void main(String[] args){
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        카드뭉치 T = new 카드뭉치();
        T.solution(cards1, cards2, goal);

    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        List<String> tempArr = new ArrayList<>();

        Queue<String> queCards1 = new LinkedList<>();
        Queue<String> queCards2 = new LinkedList<>();

        for (String x: cards1) {
            queCards1.offer(x);
        }
        for (String x: cards2) {
            queCards2.offer(x);
        }

        for (String x: goal) {
            if(!queCards1.isEmpty() && x.equals(queCards1.peek())){
                tempArr.add(queCards1.poll());
            }
            if(!queCards2.isEmpty() && x.equals(queCards2.peek())){
                tempArr.add(queCards2.poll());
            }
        }

        if(tempArr.size() == goal.length){
            answer += "Yes";
        }else {
            answer += "No";
        }

        return answer;
    }
}
