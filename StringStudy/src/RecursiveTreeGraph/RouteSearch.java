package RecursiveTreeGraph;

import java.util.Scanner;

//12 경로탐색(DFS)
public class RouteSearch {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v){
        if(v==n) answer++;
        else{
            for (int i = 1; i < n; i++) {
                if(graph[v][i] == 1 && ch[i] == 0){
                    ch[i] = 1;
                    DFS(i);
                    //백트랙킹 시점
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args){
        RouteSearch T = new RouteSearch();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //노드의 개수
        m = sc.nextInt(); //간선의 개수
        graph = new int[n+1][m+1];
        ch = new int[n+1];
        for (int i = 0; i < m ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }

}
