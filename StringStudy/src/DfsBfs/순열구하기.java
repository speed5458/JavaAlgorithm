package DfsBfs;

import java.util.Scanner;

public class 순열구하기 {
    static int m, n;
    static int[] pm;
    static int[] ch;


    public static void main(String[] args){
        순열구하기 T = new 순열구하기();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        ch = new int[n];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        T.DFS(0, arr);


    }

    public void DFS(int L, int[] arr){
        if(L == m){
            for (int i = 0; i < m; i++) {
                System.out.print(pm[i] + " ");
            }
            System.out.println();
        }else {
            for (int i = 0; i < n; i++) {
                if(ch[i] == 0){
                    pm[L] = arr[i];
                    ch[i] = 1;
                    DFS(L+1, arr);
                    ch[i] = 0;
                }else{

                }

            }

        }
    }



}
