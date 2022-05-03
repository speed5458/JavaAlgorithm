package ArrayStydy;
import java.util.ArrayList;
import java.util.Scanner;

public class Array08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrInt = new int[n];

        for (int i = 0; i < n; i++) {
            arrInt[i] = sc.nextInt();
        }

        solution(arrInt, n).forEach(integer -> System.out.print(integer + " "));

    }

    public static ArrayList<Integer> solution(int[] arrInt, int n){
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if(i == j) continue;
                if(arrInt[i] < arrInt[j]) cnt++;
            }
            answer.add(cnt);
        }
        return answer;
    }
}
