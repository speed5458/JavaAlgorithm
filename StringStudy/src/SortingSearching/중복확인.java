package SortingSearching;

import java.util.Scanner;

public class 중복확인 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrI = new int[n];
        for (int i = 0; i < n; i++) {
            arrI[i] = sc.nextInt();
        }

        System.out.print(solution(arrI));

    }

    public static String solution (int[] arrI){
        String answer = "U";

        //선택정렬로 모두 탐색해서 중복이면 D를 출력
        for (int i = 0; i < arrI.length-1; i++) {
            int target = arrI[i];
            for (int j = i+1; j < arrI.length; j++) {
                if(target == arrI[j]){
                    answer = "D";
                    return answer;
                }
            }
        }
        return answer;
    }

}
