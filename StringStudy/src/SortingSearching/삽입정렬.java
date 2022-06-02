package SortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 삽입정렬 {
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
            int target = arrI[i];
            int j = i -1;
            while (j >= 0 && target < arrI[j]){
                arrI[j+1] = arrI[j];
                j--;
            }
            arrI[j+1] = target;
        }


        return arrI;
    }
}
