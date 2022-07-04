package DfsBfs;

import java.util.Scanner;

public class 최대점수구하기 {

    static int m; //제한시간
    static int n; //문제개수
    static int answer;
    public static void main(String[] args){
        최대점수구하기 T = new 최대점수구하기();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //문제개수
        m = sc.nextInt(); //제한시간
        int[][] arr = new int[n][n];
        // 점수 || 시간

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); //점수
            arr[i][1] = sc.nextInt(); //시간
        }
        T.DFS(0, 0, 0, arr);
        System.out.println(answer);
    }

    public void DFS(int v, int sumScore, int sumTime, int[][] arr){
        if(m < sumTime) return;
        if(n == v){
            answer = Math.max(answer, sumScore);
        }else{
            DFS(v+1, sumScore + arr[v][0], sumTime + arr[v][1], arr);
            DFS(v+1, sumScore, sumTime, arr);
        }

    }



}
