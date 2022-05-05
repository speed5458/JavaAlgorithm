package ArrayStydy;

import java.util.Scanner;

//임시반장 정하기
public class Array11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arrInt = new int[n+1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arrInt[i][j] = sc.nextInt();
            }
        }
        System.out.print(solution(n, arrInt));


    }

    private static int solution(int n, int[][] arrInt) {
        int answer = 0, max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5 ; k++) {
                    if(arrInt[i][k] == arrInt[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer = i;
            }
        }
        return answer;
    }
}
