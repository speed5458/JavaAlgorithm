package SortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 버블정렬 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrI = new int[n];
        for (int i = 0; i < n; i++) {
            arrI[i] = sc.nextInt();
        }

        Arrays.stream(solution(arrI)).forEach(val -> System.out.print(val + " "));
    }
    public static int[] solution(int[] arrI){
        for (int i = 1; i < arrI.length; i++) {
            for (int j = 0; j < arrI.length-i; j++) {
                if(arrI[j+1] < arrI[j]) swap(arrI, j+1, j);
            }
        }
        return arrI;
    }

    public static void swap(int[] arrI, int i, int j){
        int temp = arrI[i];
        arrI[i] = arrI[j];
        arrI[j] = temp;
    }


}
