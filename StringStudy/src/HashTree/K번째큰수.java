package HashTree;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

//10 3
//13 15 34 23 45 65 33 11 26 42
public class K번째큰수 {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arrInt = new int[n];
    for (int i = 0; i < n; i++) {
      arrInt[i] = sc.nextInt();
    }
    System.out.println(solution(arrInt, n , k));

  }
  public static int solution(int[] arrInt, int n, int k){
    int answer = 0;
    TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
    for (int i = 0; i < n-2; i++) {
      for (int j = i+1; j < n-1; j++) {
        for (int l = j+1; l < n; l++) {
          tSet.add(arrInt[i] + arrInt[j] + arrInt[l]);
        }
      }
    }
    int cnt = 0;
    for (int x: tSet ) {
      if(tSet.size() < k) {
        answer = -1;
        break;
      }
      cnt++;
      answer = x;
      if(cnt == k) break;
    }



    return answer;
  }
}
