package ArrayStydy;

import java.util.Scanner;

public class Array12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 4 열 학생수
        int m = sc.nextInt(); //3 행 테스트수
        int[][] arrInt = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arrInt[i][j] = sc.nextInt();
            }
        }
        System.out.print(solution(arrInt, n, m));
    }

    public static int solution(int[][] arrInt, int n, int m){
        int answer = 0;
        for (int i = 1; i <= n; i++) { // 기준 사람군
            for (int j = 1; j <= n; j++) { //비교 사람군
                int cnt = 0;
                boolean isPosible = true;

                for (int k = 0; k < m; k++) { //테스트 횟수
                    int pi = 0;
                    int pj = 0;
                    for (int s = 0; s < n; s++) { // 등수 확인
                        if(arrInt[k][s] == i) pi = s;
                        if(arrInt[k][s] == j) pj = s;
                    }
                    //if(pi < pj) cnt++;
                    if(pi >= pj) { // 크거나 같은거로 줘야한다 아니면 자기랑 같은거 비교떄 여기 안타서 answer 추가됨
                        isPosible = false;
                    }
                }//end k
             //if(cnt == m) answer++;

             if(isPosible) answer++;
            } //end j
        } //end i

        return answer;
    }
}
