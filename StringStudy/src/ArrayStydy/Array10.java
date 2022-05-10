package ArrayStydy;

import java.util.Scanner;

public class Array10 {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arrInt = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrInt[i][j] = sc.nextInt();
            }
        }

        System.out.print(solution(n, arrInt));
    }

    private static int solution(int n, int[][] arrInt) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int ny = i + dx[k];
                    int nx = j + dy[k];
                    if(nx>= 0 && nx < n && ny >= 0 && ny < n && arrInt[ny][nx] >= arrInt[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;

    }
}
