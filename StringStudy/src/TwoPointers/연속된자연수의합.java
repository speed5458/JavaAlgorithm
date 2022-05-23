package TwoPointers;

import java.util.Scanner;

public class 연속된자연수의합 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(solution(n));
    }
    public static int solution(int n){
        int answer = 0, lt = 0, sum = 0;
        int[] arr = new int[n];
        int m = n/2 +1;
        for (int i = 0; i < m; i++) {
            arr[i] = i+1;
        }

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if(sum == n ) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if(sum == n) answer++;
            }
        }


        return answer;
    }
}
