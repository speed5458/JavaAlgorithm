package SortingSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrI = new int[n];

        for (int i = 0; i < n; i++) {
            arrI[i] = sc.nextInt();
        }

        for (int x : solution(arrI)) {
            System.out.print(x + " ");
        }

    }
    public static ArrayList<Integer> solution(int[] arrI){
        int[] temp = new int[arrI.length];
        ArrayList<Integer> answer = new ArrayList<>();
        //temp 똑같이 배열하나 더만들어서 둘이 다르면 push 해준다.
        for (int i = 0; i < arrI.length; i++) {
            temp[i] = arrI[i];
        }
        Arrays.sort(temp);
        //비교하면서 다르면 answer 에 push
        for (int i = 0; i < arrI.length; i++) {
            if(temp[i] != arrI[i]) answer.add(i+1);
        }


        return answer;
    }
}
