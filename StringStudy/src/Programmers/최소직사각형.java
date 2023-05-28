package Programmers;

import java.util.ArrayList;
import java.util.List;

public class 최소직사각형 {
    public static void main(String[] args){
        최소직사각형 T = new 최소직사각형();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        T.solution(sizes);
    }
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxSize = 0;
        int subMax = 0;
        //명함의 크기중 가로세로중 작은것의 크기를 담을 집합
        List<Integer> arrMin = new ArrayList<>();
        for (int[] tempI: sizes) {
            //명함을 돌면서 가로세로중 큰수를 maxSize에 담는다.
            maxSize = Math.max(maxSize, Math.max(tempI[0], tempI[1]));
            subMax = Math.max(subMax, Math.min(tempI[0], tempI[1]));
        }
        answer = maxSize * subMax;
        return answer;
    }
}
