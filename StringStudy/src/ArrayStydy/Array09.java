package ArrayStydy;

import java.util.Scanner;

public class Array09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arrInt = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrInt[i][j] = sc.nextInt();
            }
        }
        int max_val = Integer.MIN_VALUE;

        int answer = 0;
        for (int i = 0; i < n; i++) {
            int hSum = 0;
            int vSum = 0;
            for (int j = 0; j < n; j++) {
                hSum = hSum + arrInt[i][j];
                vSum = vSum + arrInt[j][i];
            }
            answer = Math.max(answer, hSum);
            answer = Math.max(answer, vSum);
        }
        int diagonal = 0;
        int reverseDiagonal = 0;
        for (int i = 0; i < n; i++) {
            diagonal += arrInt[i][i];
            reverseDiagonal += arrInt[i][n-1-i];
        }
            answer = Math.max(answer, diagonal);
            answer = Math.max(answer, reverseDiagonal);
        System.out.println(answer);






//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arrInt[i][j] + " ");
//            }
//            System.out.println();
//        }
        // 00 11 22 33 44, 04 13 22 31 40
    }
}
