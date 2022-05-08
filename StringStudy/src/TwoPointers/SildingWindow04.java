package TwoPointers;

import java.util.Scanner;

public class SildingWindow04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arrInt = new int[n];
        for (int i = 0; i < n; i++) {
            arrInt[i] = sc.nextInt();
        }
        System.out.print(solution(arrInt, n, m));
    }
    public static int solution(int[] arrInt,int n,int m){
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arrInt[j];
                if(sum == m) answer ++;
                if(sum > m) break;
            }
        }
        return answer;
    }
}
