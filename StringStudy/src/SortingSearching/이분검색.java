package SortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arrI = new int[n];
        for (int i = 0; i < n; i++) {
            arrI[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arrI));
    }
    public static int solution(int n, int m, int[] arrI){
        int answer = 0;
        //이분검색은 정렬이 무조건 되어있어야 한다.
        Arrays.sort(arrI);
        int lt =0, rt=n-1;
        while(lt<=rt){
            int mid = (lt+rt) / 2;
            if(arrI[mid] == m){
                answer = mid + 1;
                break;
            }
            if(arrI[mid] > m) rt = mid -1;
            else lt = mid + 1;
        }

        return answer;
    }

}
