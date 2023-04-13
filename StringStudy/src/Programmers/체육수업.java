package Programmers;

import java.util.*;

public class 체육수업 {
    public static void main(String[] args){
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        체육수업 T = new 체육수업();
        T.solution(n, lost, reserve);
    }
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        answer = n- lost.length;

        //체육복을 갖고왔지만 도난당한사람 수 , 체육복 빌려줄수 없음
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 도난당했지만 체육복을 빌릴 수 있는 학생 수
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}
