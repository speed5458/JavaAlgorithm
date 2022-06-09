package SortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간정하기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arrI = new int[n];
        for (int i = 0; i < n; i++) {
            arrI[i] = sc.nextInt();
        }

        System.out.println(solution(n, c, arrI));

    }

    public static int count(int[] arrI, int dist){
        //dist 거리값 들어오면 몇마리 들어갈수 있는지 반환
        int cnt = 1;
        int ep = arrI[0];
        for (int i = 1; i < arrI.length; i++) {
            if(arrI[i] - ep >= dist){
                cnt++;
                ep = arrI[i];
            }
        }
        return cnt;
    }

    public static int solution(int n, int c, int[] arrI){
        int answer = 0;
        Arrays.sort(arrI); //정렬
        int lt = 1;
        int rt = arrI[n-1];

        while(lt <= rt){
            int mid = (lt+rt) /2;
            if(count(arrI, mid) >= c){ //반환값이 제시된 마리수보다 크면 더크게 벌릴수 있다는 의미
                answer = mid;
                lt = mid + 1;
            }else{
                rt = mid -1;
            }
        }
        // lt rt 를 설정 rt 는 배열의 최대값 lt 는 최소값
        //mid 값을 설정 mid 값은 최소 거리이고 여기서 mid 값보다 같거나 큰수로 c 마리 배치가 가능한지 여부를 학인


        return answer;
    }
}
