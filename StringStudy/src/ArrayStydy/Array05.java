package ArrayStydy;

import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arrC = new int[n+1];
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if(arrC[i]==0){
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    arrC[j] = 1;
                }
            }
        }
        System.out.println(answer);

    }
}

