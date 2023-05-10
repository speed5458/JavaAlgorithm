package Programmers;

import java.util.Arrays;
import java.util.Collections;

public class 과일장수 {
    public static void main(String[] args){
        과일장수 T = new 과일장수();
        int k = 4; //과일점수 최대점수
        int m= 3; //M개씩 포장
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        T.solution(k, m, score);
    }

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        //역정렬 해주기위해서 Integer로 감싼다.
        Integer[] scoreBoxed = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreBoxed, Collections.reverseOrder());

        for (int i = m; i <= scoreBoxed.length ; i+=m) {
            int p = scoreBoxed[i-1];//scoreBoxed[i-1] 은 해당 박스에서 가장 작은 숫자가 된다.
            answer += m * p;
        }
        return answer;
    }
}
