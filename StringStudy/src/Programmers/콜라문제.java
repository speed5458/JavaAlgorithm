package Programmers;

public class 콜라문제 {
    public static void main(String[] args){
        콜라문제 T = new 콜라문제();
        int a = 3; //빈병제출 개수
        int b = 1; //콜라 받을수있는 개수
        int n = 20; // 갖고있는 빈병의 개수
        T.solution(a, b, n);
    }

    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a){
            int remainN = n % a;
            int getN = (n / a) * b;
            n = remainN + getN;
            answer += getN;
        }
        return answer;
    }
}
