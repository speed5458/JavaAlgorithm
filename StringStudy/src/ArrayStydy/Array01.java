package ArrayStydy;

import java.util.ArrayList;
import java.util.Scanner;

//큰수 출력하기
//6
// 7 3 9 5 6 12
public class Array01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrC = new int[n];
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrC[i] = sc.nextInt();
        }
        answer.add(arrC[0]);
        for (int i = 1; i < n; i++) {
            if(arrC[i]>arrC[i-1]){
                answer.add(arrC[i]);
            }
        }
        for (int x : answer ) {
            System.out.print(x + " ");
        }


    }
}
