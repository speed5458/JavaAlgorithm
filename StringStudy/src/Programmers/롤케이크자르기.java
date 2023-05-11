package Programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 롤케이크자르기 {
    public static void main(String[] args){
        롤케이크자르기 T = new 롤케이크자르기();
        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
        T.solution(topping);
    }
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        //Map에다가 전체 토핑의 개수를 구한다.
        for (int i = 0; i < topping.length; i++) {
            map.put(topping[i], map.getOrDefault(topping[i], 0) + 1);
        }
        //토핑배열 첫번째부터 돌면서 Set에는 i위치의 토핑을 추가 해줘가면서 Map에 추가한 토핑 개수랑 비교한다.
        for (int i = 0; i < topping.length; i++) {
            set.add(topping[i]);
            map.put(topping[i], map.get(topping[i]) -1 );
            if(map.get(topping[i]) == 0) map.remove(topping[i]);
            if(set.size() == map.size()) answer++;
        }
        return answer;
    }
}
