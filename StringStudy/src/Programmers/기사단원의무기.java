package Programmers;

public class 기사단원의무기 {
    public static void main(String[] args){
        기사단원의무기 T = new 기사단원의무기();
        int number = 100;
        int limit = 3;
        int power = 2;
        T.solution(number, limit, power);
    }

    public int solution(int number, int limit, int power) {
        int answer = 0;
        //1 ~ number까지 탐색
        for (int i = 1; i <= number; i++) {
            int divisor = divisorCnt(i, limit, power);
            answer += divisor > limit ? power : divisor;
        }
        return answer;
    }

    public int divisorCnt(int target, int limit, int power){
        int cnt = 0;
        //제곱근 까지 탐색
        for (int i = 1; i <= Math.sqrt(target); i++) {
            //i 제곱의 값이 target 이면 제곱근의 값이므로 중복이 된다.
            if(i*i == target){
                cnt ++;
            }else if(target % i == 0){
                //제곱근활용해서 약수 구할때 target을 i 로 나누면 약수가 구해진다
                cnt += 2;
            }
        }
        return cnt;
    }
}
