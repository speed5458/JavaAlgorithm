package Programmers;

import java.util.*;

public class 숫자카드나누기 {
    public static void main(String[] args){
        숫자카드나누기 T = new 숫자카드나누기();
        int[] arrayA = {14, 35, 119};
        int[] arrayB = {18, 30, 102};
        T.solution(arrayA, arrayB);
    }

    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;

        //순서대로 정렬
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        //Key의 큰수 부터 꺼내기위해서 TreeMap 사용
        TreeMap<Integer, Integer> divisorMap = new TreeMap<>();

        //arrayA돌면서 divisorMap에 담는다.
        for (int i = 1; i <= arrayA[0]; i++) {
            boolean isDivisor = true;
            for (int iArr:arrayA) {
                if(iArr % i != 0) {
                    isDivisor = false;
                    break;
                }
            }
            if(isDivisor){
                divisorMap.put(i, 0);
            }
        }

        // arrayB돌면서 공약수가 이미 배열에 들어있음 삭제하고 없으면 추가한다;
        for (int i = 1; i <= arrayB[0]; i++) {
            boolean isDivisor = true;
            for (int iArr:arrayB) {
                if(iArr % i != 0) {
                    isDivisor = false;
                    break;
                }
            }
            if(isDivisor){ //공약수 t, f
                if(divisorMap.containsKey(i)){
                    divisorMap.remove(i); //이미 공약수 배열에 들어있으면 삭제
                }else{
                    divisorMap.put(i, 1); //없으면 추가
                }
            }
        }

        //두배열의 공약수가 들어있는 Map이 전부 없어질때까지 탐색
        while (!divisorMap.isEmpty()){
            int division = divisorMap.lastKey();
            boolean isDivision = true;

            //value가 1이면 arrayB 의 약수
            if(divisorMap.get(division) == 1){
                //arrayA 의 약수를 탐색하면서 약수가 있는지 비교
                for (int iArr:arrayA) {
                    if(iArr % division == 0){
                        isDivision = false;
                        divisorMap.remove(division);
                        break;
                    }
                }

            }else{
                //arrayB 의 약수
                for (int iArr:arrayB) {
                    if(iArr % division == 0){
                        isDivision = false;
                        divisorMap.remove(division);
                        break;
                    }
                }
            }
            //isDivision이 T 면 상대편에 약수가 없다는뜻
            if(isDivision){
                answer = division;
                break;
            }
        }
        return answer;
    }
}
