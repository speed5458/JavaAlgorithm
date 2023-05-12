package Programmers;

import java.util.HashSet;
import java.util.Set;

public class 연속부분수열합의개수 {
    public static void main(String[] args){
        연속부분수열합의개수 T = new 연속부분수열합의개수();
        int[] elements = {7, 9, 1, 1, 4};
        T.solution(elements);
    }

    public int solution(int[] elements) {
        int answer = 0;
        //7 9 1 1 4  7 9 1 1 4
        int[] myElements = new int[elements.length * 2];
        //elements 를 두번 넣어준다.
        int cnt = 0;
        for (int i = 0; i < 2; i++) {
            for (int iArr: elements) {
                myElements[cnt++] = iArr;
            }
        }
        Set<Integer> sumSet = new HashSet<>();
        //길이가 1 ~ elements 인 연속 부분수열을 구하자.
        //window 개수
        for (int i = 1; i <= elements.length; i++) { //window 갯수
            for (int s = 0; s < elements.length; s++) { //시작점의 위치 s
                int sum = 0;
                for (int j = s; j < s+i; j++) { // 시작점 부터 window 개수만큼 반복
                    sum += myElements[j];
                }
                sumSet.add(sum);
            }
        }
        answer = sumSet.size();
        return answer;
    }
}
