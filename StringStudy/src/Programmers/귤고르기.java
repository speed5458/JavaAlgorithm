package Programmers;

import java.util.*;

public class 귤고르기 {
    public static void main(String[] args){
        귤고르기 T = new 귤고르기();
        int k = 2;
        int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};
        T.solution(k, tangerine);
    }

    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        List<Integer> arr = new ArrayList<>(map.values());
        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i : arr) {
            k -= i;
            answer++;
            if(k < 1){
                break;
            }
        }
        return answer;
    }
}
