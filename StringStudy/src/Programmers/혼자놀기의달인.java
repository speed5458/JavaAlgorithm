package Programmers;

import java.util.*;

public class 혼자놀기의달인 {
    public static void main(String[] args){
        혼자놀기의달인 T = new 혼자놀기의달인();
        int[] cards = {8,6,3,7,2,5,1,4};
        T.solution(cards);
    }
    public int solution(int[] cards) {
        int answer = 0;
        List<ArrayList<Integer>> boxG = new ArrayList<>();
        for (int i = 0; i < cards.length; i++) {
            int sel = cards[i];
            ArrayList<Integer> box = new ArrayList<>();
            while (true){
                sel = cards[sel-1];
                if(!box.contains(sel)){
                    box.add(sel);
                }else {
                    break;
                }
            }
            //box 소그룹 정렬
            box.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
            boxG.add(box);
        }
        //box 대그룹 정렬
        boxG.sort(new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.size() - o2.size();
            }
        });
        //박스대그룹의 숫자가 1이면 0 return
        if(boxG.size() == 1){
            return 0;
        }
        //대그룹의박스들중 사이즈가 가장큰 배열의 첫번째값
        int maxI = boxG.get(boxG.size()-1).get(0);
        for (int i = boxG.size()-1; i >= 0; i--) {
            List<Integer> tempArr = boxG.get(i);
            int tempI = tempArr.get(0);
            //큰사이즈부터 돌면서 첫번째 인덱스를 비교한다.
            if(tempI != maxI){
                answer = boxG.get(boxG.size()-1).size() * tempArr.size();
                return answer;
            }
        }
        return answer;
    }
}
