package DfsBfs;

import java.util.Scanner;

public class 조합의경우수 {
    int[][] dy = new int[35][35];


    public static void main(String[] args){
        조합의경우수 T = new 조합의경우수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.DFS(n, r));
    }

    public int DFS(int n, int r ){
        if(dy[n][r] > 0) return dy[n][r];
        if(n == r || r == 0) return 1;
        else return dy[n][r] = DFS(n-1,r-1) + DFS(n-1, r);
    }

}
