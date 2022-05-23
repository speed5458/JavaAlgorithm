package TwoPointers;

import java.util.Scanner;

public class SlidingWindow01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arrInt = new int[n];
        for (int i = 0; i < n; i++) {
            arrInt[i] = sc.nextInt();
        }
        System.out.print(solution(arrInt,n,k));
    }

    public static int solution(int[] arrInt,int n,int k){
        int answer = 0, sum = 0;

        for (int i = 0; i < k; i++) sum += arrInt[i];
        answer += sum;
        for (int i = k; i < n; i++) {
            sum+=(arrInt[i]-arrInt[i-k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}
