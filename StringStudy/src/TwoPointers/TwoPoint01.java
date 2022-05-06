package TwoPointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TwoPoint 알고리즘
// 두개의 포인트를 잡고 While 문사용해서 합쳐준다. point 가 두개 필요 a, b
public class TwoPoint01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arrB = new int[m];
        for (int i = 0; i < m; i++) {
            arrB[i] = sc.nextInt();
        }

        for (int x: solution(arrA, arrB, n , m)) {
            System.out.print(x+ " ");
        }
    }

    public static List<Integer> solution(int[]arrA, int[]arrB, int n, int m){
        List<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m){
            if(arrA[p1] < arrB[p2]) answer.add(arrA[p1++]);
            else answer.add(arrB[p2++]);
        }
        while (p1 < n) answer.add(arrA[p1++]);
        while (p2 < n) answer.add(arrB[p2++]);

        return answer;
    }
}
