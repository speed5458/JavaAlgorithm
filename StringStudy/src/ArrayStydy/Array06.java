package ArrayStydy;

import java.util.ArrayList;
import java.util.Scanner;

public class Array06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrC = new int[n];
        for (int i = 0; i < n; i++) {
            arrC[i] = sc.nextInt();
        }

        for (int x : solution(n,arrC)) {
            System.out.print(x + " ");
        }

    }

    private static ArrayList<Integer> solution(int n, int[] arrC) {
        ArrayList answer = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < n; i++) {
            num = arrC[i];
            int reverseNum = 0;
            while (num != 0) {
                int digit = num % 10;
                reverseNum = reverseNum * 10 + digit;
                num /= 10;
            }
            if(isPrime(reverseNum)) answer.add(reverseNum);
        }
        return answer;
    }

    private static boolean isPrime(int num) {
        if(num == 1) return false;
        for (int i = 2; i < num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
