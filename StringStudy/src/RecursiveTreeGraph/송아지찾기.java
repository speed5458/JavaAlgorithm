package RecursiveTreeGraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기 {
    public static void main(String[] args){
        송아지찾기 T = new 송아지찾기();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(T.BFS(s, e));
    }
    int[] dis = {1, -1, 5}; //콩콩으로 이동할수있는 종류
    int[] ch; //방문한 좌표 입력
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int s, int e){
        ch = new int[10001];
        ch[s] = 1; //방문한 좌표는 1로 둔다.
        Q.offer(s);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                if (x == e) return L;
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if(nx >= 1 && nx <= 10000 && ch[nx] == 0){ //좌표의 조건 확인및 방문했는지 확인한다.
                        //첫방문시 로직
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }
}
