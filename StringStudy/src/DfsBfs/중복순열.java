package DfsBfs;

import java.util.Scanner;

public class 중복순열 {
    static int n, m;
    static int[] arr;

    public static void main(String[] args){
        중복순열 T = new 중복순열();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];

        T.DFS(0);
    }

    public void DFS(int v){
        if(v == m){
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }else{
            for (int i = 1; i <= n; i++) {
                arr[v] = i;
                DFS(v+1);
            }
        }

    }
}
