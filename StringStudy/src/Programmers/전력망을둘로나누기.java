package Programmers;

import java.util.*;

public class 전력망을둘로나누기 {
    static int[][] myWires;
    public static void main(String[] args){
        전력망을둘로나누기 T = new 전력망을둘로나누기();
        int n = 9;
        int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
        T.solution(n, wires);
    }
    public int solution(int n, int[][] wires) {
        int answer = n;
        myWires= new int[n+1][n+1];

        //1. 2차원 배열로 인접행렬을 그린다.
        for(int i=0; i<wires.length; i++){
            myWires[wires[i][0]][wires[i][1]]=1;
            myWires[wires[i][1]][wires[i][0]]=1;
        }

        //2. Wires노드 하나씩 삭제해가면서 bfs를 돌린다.
        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0];
            int b = wires[i][1];
            //노드삭제
            myWires[a][b] = 0;
            myWires[b][a] = 0;
            int rs = bfs(n, a);
            answer = Math.min(answer, rs);
            //노드재추가
            myWires[a][b] = 1;
            myWires[b][a] = 1;

        }
        return answer;
    }

    public int bfs(int n, int s){
        //방문했는지 여부 배열
        int[] ch = new int[n+1];
        int cnt = 1;
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        while (!q.isEmpty()){
            int node = q.poll();
            ch[node] = 1;
            for (int i = 0; i <= n; i++) {
                //이미방문한 Node일경우에는 지나친다.
                if(ch[i] == 1) continue;
                //노드가 있는부분만 지나간다.
                if(myWires[node][i] == 1){
                    q.offer(i);
                    cnt++;
                }
            }
        }
        int rs = cnt - (n - cnt);
        return Math.abs(rs);
    }
}
