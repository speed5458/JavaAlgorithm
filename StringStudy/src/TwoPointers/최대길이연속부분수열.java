package TwoPointers;
import java.util.Scanner;

/*
*
* 14 2
 1 1 0 0 1 1 0 1 1 0 1 1 0 1
  * answer = 8
* */
public class 최대길이연속부분수열 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arrInt = new int[n];
        for (int i = 0; i < n; i++) {
            arrInt[i] = sc.nextInt();
        }
        System.out.print(solution(arrInt, n, k));
    }
    public static int solution(int[] arr,int n,int k){
        int answer = 0,lt=0, cnt=0;

        for (int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) cnt++;
            while(cnt > k){
                if(arr[lt] == 0) cnt --;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }

        return answer;
    }
}
