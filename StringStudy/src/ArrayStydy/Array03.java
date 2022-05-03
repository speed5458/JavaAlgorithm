package ArrayStydy;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrC1 = new int[n];

        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            arrC1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int comp = sc.nextInt();
            if(arrC1[i] == 1 && comp == 3){
                answer[i] = "A";
            } else if (arrC1[i] == 2 && comp == 1) {
                answer[i] = "A";
            } else if (arrC1[i] == 3 && comp ==2){
                answer[i] = "A";
            } else if (arrC1[i] == comp) {
                answer[i] = "D";
            }else {
                answer[i] = "B";
            }
        }

        for (String x: answer) {
            System.out.println(x);
        }
    }
}
