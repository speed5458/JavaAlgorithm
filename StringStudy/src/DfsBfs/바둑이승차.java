package DfsBfs;

import java.util.Scanner;

public class 바둑이승차 {

    static int answer;
    static int c, n;



    public static void main(String[] args){
        바둑이승차 T = new 바둑이승차();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        T.DFS(0,0, arr);
        System.out.println(answer);
    }

    public void DFS(int v, int sum, int[] arr){
        if(sum > c) return;
        if(v == n){
            answer = Math.max(answer,sum);
        }else{
            DFS(v+1,sum+arr[v], arr);
            DFS(v+1,sum, arr);
        }

    }



}
