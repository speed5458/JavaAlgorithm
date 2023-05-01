package Programmers;

import java.util.PriorityQueue;

public class 디펜스게임 {
    //남은 병사 수보다 라운드의 적의 수가 더 많으면 게임 종료
    //무적 스킬 k번 사용 가능
    public static void main(String[] args){
        디펜스게임 T = new 디펜스게임();
        int n = 7; //병사 수
        int k = 3; // 무적 사용 횟수
        int[] enemy = {4, 2, 4, 5, 3, 3, 1};
                        //4, 6, 10, 15, 18, 21, 22

        T.solution(n, k, enemy);

    }
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for (int round = 0; round < enemy.length; round++) {
            //각 라운드의 적의 수를 Que에 담는다.
            que.add(enemy[round]);
            //무적의 수 보다 방어할 라운드가 많으면, 적의 수가 가장 적은 라운드 전투하여 병력 감소
            if(que.size() > k){
                n -= que.poll();
            }
            // 병력이 0보다 작아지면 게임종료 해당라운드 수를 반환
            if(n < 0)
                return round;
        }

        //클리어 한 경우, 총 라운드 수 반환
        return enemy.length;
    }

}
