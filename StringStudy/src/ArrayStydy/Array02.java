package ArrayStydy;

import java.util.Scanner;

//8
//        130 135 148 140 145 150 150 153
public class Array02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrC = new int[n];
        for (int i = 0; i <n; i++) {
            arrC[i] = sc.nextInt();
        }
        int max_vale = arrC[0];
        int answer = 1;
        for (int i = 1; i < n; i++) {
            if(max_vale < arrC[i]){
                answer++;
                max_vale = arrC[i];
            }
        }
        System.out.println(answer);
    }
}
