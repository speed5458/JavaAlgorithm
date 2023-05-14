package Programmers;

import java.util.*;
import java.util.stream.Collectors;

public class 숫자짝꿍 {
    public static void main(String[] args){
        숫자짝꿍 T = new 숫자짝꿍();
        String X = "12321";
        String Y = "42531";
        T.solution(X, Y);
    }
    public String solution(String X, String Y) {
        String answer = "";
        Map<String, Integer> mapX = new HashMap<>();
        Map<String, Integer> mapY = new HashMap<>();
        List<String> arrS = new ArrayList<>();

        for (String s : X.split("")) {
            mapX.put(s, mapX.getOrDefault(s,0)+1);
        }
        for (String s : Y.split("")) {
            mapY.put(s, mapY.getOrDefault(s,0)+1);;
        }

        for (String keyY: mapY.keySet()) {
            //keyY값이 mapX 에 없으면 건너뛴다.
            if(!mapX.containsKey(keyY)) continue;
            //mapY 의 value
            int yValCnt = mapY.get(keyY);
            //mapX 의 value
            int xValCnt = mapX.get(keyY);

            //반복 몇번할지 최소수를 구함
            int loopCnt = Math.min(xValCnt, yValCnt);
            while (loopCnt != 0){
                arrS.add(keyY);
                loopCnt--;
            }
        }
        answer = arrS.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());
        if(answer.length() == 0){
            answer = "-1";
        } else if (answer.charAt(0) == '0') {
            answer = "0";
        }
        return answer;
    }
}
