package Programmers;

public class 약수의개수와덧셈 {
    public static void main(String[] args){
        약수의개수와덧셈 T = new 약수의개수와덧셈();
        int left = 13;
        int right = 17;
        T.solution(left, right);
    }
    public int solution(int left, int right) {
        int answer = 0;
        //약수의 개수가 짝수인것은 더하고 홀수인것은 빼자
        //1. left ~ right 까지 for문을 돌면서 각각의 약수 개수를 구한다.

        for (int i = left; i <= right; i++) {
            int cnt = divisorCnt(i);
            //개수가 짝수면 더하고 홀수면 빼자
            if(cnt % 2 == 0){
                //짝수일경우
                answer += i;
            }else{
                //홀수일경우
                answer -= i;
            }
        }
        return answer;
    }
    public int divisorCnt(int n){
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                cnt ++;
            }
        }
        return cnt;
    }
}
