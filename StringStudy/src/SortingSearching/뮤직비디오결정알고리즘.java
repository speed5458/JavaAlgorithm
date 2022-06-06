package SortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class 뮤직비디오결정알고리즘 {
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

    public static int count(int[] arrI, int capacity){
        int cnt = 1, sum =0;
        for (int x : arrI) {
            if(sum+x > capacity){
                cnt++;
                sum=x;
            }else{
                sum += x;
            }
        }
        return cnt;
    }
    public static int solution(int n, int m, int[] arrI){
        int answer = 0, lt = 0, rt = 0, mid = 0;
        //배열에서 최대값, 배열 전체 sum 값을 구한다.
        //전체 총합의 경우의 수를 구한다 1. 배열에서 최대값을 lt 로 놓고 전체 합을 rt 로 계산
        rt = Arrays.stream(arrI).sum();
        lt = Arrays.stream(arrI).max().getAsInt();
        //mid 값 만큼 앞에서부터 더해서 잘랐을때 m이 3개가 나오는지 확인
        while(lt <= rt){
            mid = (rt + lt) / 2;
            if(count(arrI, mid) <= m){
                answer = mid;
                rt = mid -1;
            }else{
                lt = mid +1;
            }
        }
        return answer;
    }


}
