package Programmers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 택배상자 {
    public static void main(String[] args){
        택배상자 T = new 택배상자();
        int[] order = {5, 4, 3, 2, 1};
        // 2 3
        T.solution(order);
    }

    public int solution(int[] order) {
        int answer = 0;
        int point = 0;
        Queue<Integer> qMain = new LinkedList<>();
        Stack<Integer> sSub = new Stack<>();

        //1 ~ order.length 까지의 수를 qMain 에다가 담는다.
        for (int i = 1; i <= order.length; i++) {
            qMain.offer(i);
        }

        //qMain 이 빌때까지 while 문을 돈다.
        while (!qMain.isEmpty()){
            int pos = order[point]; //지금담아야되는 물건번호
            int mBelt = qMain.poll();
            //현재 벨트위에있는 물건과 담아야되는 물건이 같으면
            if(mBelt == pos){
                point++;
                if(point >= order.length) break;
                pos = order[point];
            }else{ //다르면 보조벨트에다가 집어넣는다.
                sSub.push(mBelt);
            }
            //보조벨트에서 물건을 빼준다. 택배기사가 원하는거하고 다를때까지
            while (sSub.size() > 0 && sSub.peek() == pos){
                sSub.pop();
                point++;
                if(point >= order.length) break;
                pos = order[point];
            }
        }
        answer = point;
        return answer;
    }
}
