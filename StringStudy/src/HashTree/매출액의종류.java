package HashTree;

import java.util.*;

public class 매출액의종류 {
    public static void main(String[] args){
        //7 4
        //20 12 20 10 23 17 10
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arrInt = new int[n];
        for (int i = 0; i < n; i++) {
            arrInt[i] = sc.nextInt();
        }


        for (Integer x : solution(arrInt, n, k) ) {
            System.out.print(x + " ");
        }

    }
    public static List<Integer> solution(int[] arrInt, int n, int k){
        int lt = 0;
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> numCase = new HashMap<>();
        //sliding Window 활용 한칸씩 이동하면서 탐색하면서 Hashset 에 넣어준후 Key 개수를 answer 에 add 해준다.

        for (int i = 0; i < k-1; i++) {
            numCase.put(arrInt[i], numCase.getOrDefault(arrInt[i], 0) + 1);
        }

        for (int rt = k-1; rt < n; rt++) {
            numCase.put(arrInt[rt], numCase.getOrDefault(arrInt[rt], 0) + 1);
            answer.add(numCase.size());
            numCase.put(arrInt[lt], numCase.getOrDefault(arrInt[lt], 0) - 1);
            if(numCase.get(arrInt[lt]) == 0) numCase.remove(arrInt[lt]);
            lt++;
        }

        return answer;
    }
}
