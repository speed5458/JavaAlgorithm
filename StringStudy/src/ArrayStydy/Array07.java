package ArrayStydy;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Array07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrC = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            arrC[i] = sc.nextInt();
        }

        for (int x: solution(arrC, n)) {
            answer += x;
        }
        System.out.println(answer);
    }

    public static ArrayList<Integer> solution(int[] arr, int n){
        ArrayList<Integer> score = new ArrayList<>();
        score.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if(arr[i] == 1){
               score.add(score.get(i-1) + 1);
            }else{
                score.add(0);
            }
        }
        return score;
    }


}
