package Programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 할인행사 {
    public static void main(String [] args){
        할인행사 T = new 할인행사();
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork",
                "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        T.solution(want, number, discount);

    }
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> discMap = new HashMap<>();
        Map<String, Integer> wantMap = new HashMap<>();
        //10일단위의 discountMap 생성
        //9까지 해주는 이유는 for문 돌면서 하나씩 추가해주기 위해서
        for (int i = 0; i < 9; i++) {
            discMap.put(discount[i], discMap.getOrDefault(discount[i], 0) + 1);
        }
        //wantMap 생성
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        Set<String> wantKey = wantMap.keySet();
        //9부터 시작하는 이유는 9개만 담아놨기 때문에 담고 빼고 담고 빼고, discount 길이만큼 반복해줄것이다.
        for (int i = 9; i < discount.length; i++) {
            int cnt = 0;
            discMap.put(discount[i], discMap.getOrDefault(discount[i], 0)+1);
            //for문돌면서 확인한다.
            for (String key: wantKey) {
                int wantVal = wantMap.get(key);
                int discVal = discMap.getOrDefault(key, 0);
                if(wantVal - discVal <= 0){//할인종목을 모두 담을수 있다.
                    cnt++;
                    continue;
                }else{ // 원하는종목을 모두 담을수 없다.
                    break;
                }
            }
            if(cnt == wantMap.size()){ // 원하는것을 모두 살수 있으면
                answer++;
            }
            //discMap 증가하기위해 맨앞쪽을 미리 빼준다.
            discMap.put(discount[i-9], discMap.get(discount[i-9])-1);
            if(discMap.get(discount[i-9]) == 0){
                discMap.remove(discount[i-9]);
            }
        }
        return answer;
    }
}
