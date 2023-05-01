package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 테이블해시함수 {
    public static void main(String[] args){
        int[][] data = {{2,2,6},{1,5,10},{4,2,9},{3,8,3}};
        int col = 2;
        int row_begin = 2;
        int row_end = 3;
        테이블해시함수 T = new 테이블해시함수();
        T.solution(data, col, row_begin, row_end);

        //{4, 2, 9}, {2, 2, 6}, {1, 5, 10}, {3, 8, 3}
    }

    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        //1. 정렬(col번째 기준으로 오름차순 정렬하고 값이 동일하면 첫번째 컬럼 기준으로 내림차순정렬)
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[col - 1] == o2[col - 1]){
                    return o2[0] - o1[0];
                }
                return o1[col - 1] - o2[col - 1];
            }
        });

        List<Integer> modArr = new ArrayList<>();
        //2. begin ~ end 까지 Mod 합을 modArr 배열에 집어넣는다.
        for (int i = row_begin-1; i <= row_end-1; i++) {
            int sum = 0;
            for (int j = 0; j < data[0].length; j++) {
                int tempMod = data[i][j] % (i+1);
                sum += tempMod;
            }
            modArr.add(sum);
        }

        //3. modArr에 집어넣은 합 들을 하나씩 꺼내면서 XOR 연산해서 answer 에 넣어준다.
        answer = modArr.get(0);
        for (int i = 1; i < modArr.size(); i++) {
            answer ^= modArr.get(i);
        }
        return answer;
    }
}
