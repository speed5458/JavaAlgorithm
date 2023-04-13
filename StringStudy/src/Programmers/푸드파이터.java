package Programmers;

public class 푸드파이터 {
    public static void main(String[] args){
        푸드파이터 T = new 푸드파이터();
        int[] food = {1, 3, 4, 6};
        T.solution(food);
    }

    public String solution(int[] food) {
        String answer = "0";
        for (int i = food.length-1; i > 0; i--) {
            int foodN = food[i]; // 음식 숫자 나누기해서 넣자
            int answerLoop = foodN/2;
            int foodKind = i;//음식의 종류
            for (int j = 0; j < answerLoop; j++) {
               answer =  foodKind + answer + foodKind;
            }
        }
        return answer;
    }

}
