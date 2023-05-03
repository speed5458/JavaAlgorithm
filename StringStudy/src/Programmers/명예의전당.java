package Programmers;

import java.util.PriorityQueue;

public class 명예의전당 {
    public static void main(String[] args){
        명예의전당 T = new 명예의전당();
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        T.solution(k, score);
    }
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            if(pq.size() < k){
                pq.offer(score[i]);
            }else{
                if(pq.peek() < score[i]){
                    pq.poll();
                    pq.offer(score[i]);
                }
            }
            answer[i] = pq.peek();
        }
        return answer;
    }
}
