package TwoPointers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoPoint02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arrB = new int[n];
        for (int i = 0; i < m; i++) {
            arrB[i] = sc.nextInt();
        }

        solution(arrA, arrB, n, m)
                .forEach(integer -> System.out.print(integer + " "));
    }
    public static List<Integer> solution(int[] arrA, int[] arrB,int n ,int m){
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arrA[i] == arrB[j]) answer.add(arrA[i]);
            }
        }

        return answer ;
    }
}
