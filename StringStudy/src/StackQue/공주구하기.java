package StackQue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주구하기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(n, k));

    }
    public static int solution(int n, int k){
        int answer = 0;

        Queue<Integer> que = new LinkedList<>();
        //1 2 3 4 5 6 7 8 ,  3
        for (int i = 0; i < n; i++) {
            que.offer(i+1);
        }
        for (int i = 0; i < n-1; i++) {//n-1번 돌면서 빼고 다시 뒤에 넣는다.
            int cnt = 0;
            while (cnt != k-1){
                que.offer(que.poll());
                cnt ++;
            }
            que.poll();
        }
        answer = que.poll();

        return answer;
    }
}
