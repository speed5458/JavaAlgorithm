package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 두큐합같게만들기 {
    public static void main(String[] args){
        두큐합같게만들기 T = new 두큐합같게만들기();
        int[] queue1 = {1, 1};
        int[] queue2 = {1, 5};
        T.solution(queue1, queue2);

    }

    public int solution(int[] queue1, int[] queue2) {
        int answer = -1;
        long sumQ1 = 0;
        long sumQ2 = 0;
        long req = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        //큐에 담는다.
        for (int i = 0; i < queue1.length; i++) {
            int curQ1 = queue1[i];
            int curQ2 = queue2[i];
            q1.offer(curQ1);
            q2.offer(curQ2);
            sumQ1 += curQ1;
            sumQ2 += curQ2;
        }
        req = sumQ1 + sumQ2;
        //홀수면 답이 나올수 없으므로 -1을 반환
        if(req % 2 != 0){
            return -1;
        }
        req /= 2;//필요한 합
        int p1 = 0; // q1이 poll할때마다 늘어날 값
        int p2 = 0; // q2가 poll할때마다 늘어날 값
        int limit = queue1.length*2;
        //최대 돌수있는 값은 q1이던 q2던 최대길이의 *2만큼 이거이상가면 그냥 계속 반복일뿐
        while (p1 <= limit && p2 <= limit){
            if (sumQ2 == req) {
                return p1 + p2;
            }
            if(sumQ2 > req){
                sumQ1 += q2.peek();
                sumQ2 -= q2.peek();
                q1.offer(q2.poll());
                p2++;
            }else {
                sumQ2 += q1.peek();
                sumQ1 -= q1.peek();
                q2.offer(q1.poll());
                p1++;
            }
        }
        return -1;
    }
}
