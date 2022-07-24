package DfsBfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전교환 {
    static int n, m;
    static Integer[] arr;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args){
        동전교환 T = new 동전교환();

        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());



        m = sc.nextInt();
        T.DFS(0, 0);
        System.out.println(answer);
    }

    public void DFS(int L, int sum){
        //System.out.println(L + " :::: " + sum);
        if(sum > m) return;
        if(L >= answer) return;
        if(sum == m) {
            answer = Math.min(L, answer);
        }else{
            for (int i = 0; i < n; i++) {
                DFS(L+1 , sum + arr[i]); //sum += arr[i] 로 두면 값이 왜 4가 나옴??????????
            }
        }

    }
}
