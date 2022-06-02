package SortingSearching;

import java.util.ArrayList;
import java.util.Scanner;

public class LeastRecentlyUsed {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = sc.nextInt();
        int[] arrI = new int[n];
        int[] cache = new int[size];
        for (int i = 0; i < n; i++) {
            arrI[i] = sc.nextInt();
        }

        for (int x: solution(size, n, arrI, cache) ) {
            System.out.print(x + " ");
        }

    }

    public static int[] solution(int size, int n, int[] arrI, int[] cache){

        //삽입정렬로 풀자.
        //Hit일경우 cache[i] = cache[i-1]
        //Miss 일경우 cache[i] = cache[i-1]
        for (int x : arrI ) {
            int pos = -1;
            for (int i = 0; i < size; i++) { //Hit 여부 확인
                if(x == cache[i]){// HIT
                    pos = i;
                }
            }
            if(pos == -1){ //miss
                for (int i = size-1; i >= 1; i--) {
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            }else{ //HIT
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            }
        }


        return cache;
    }


}
