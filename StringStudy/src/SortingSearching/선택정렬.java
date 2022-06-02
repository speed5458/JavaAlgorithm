package SortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 선택정렬 {
    //6
    //13 5 11 7 23 15
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrI = new int[n];
        for (int i = 0; i < n; i++) {
            arrI[i] = sc.nextInt();
        }
        Arrays.stream(solution(arrI)).forEach(value -> System.out.print(value + " "));
    }
    public static int[] solution(int[] arrI){

        for (int i = 0; i < arrI.length - 1; i++) {
            int min_index = i;
            for (int j = i+1; j < arrI.length; j++) {
                if (arrI[min_index] > arrI[j]) min_index = j;
            }
            swap(arrI, i, min_index);
        }

        return arrI;
    }

    public static void swap(int[] arrI, int i, int j){
        int temp = arrI[i];
        arrI[i] = arrI[j];
        arrI[j] = temp;
    }
}
