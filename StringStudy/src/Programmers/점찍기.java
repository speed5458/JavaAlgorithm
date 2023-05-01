package Programmers;

public class 점찍기 {
    public static void main(String[] args){
        점찍기 T = new 점찍기();
        int k = 2;
        int d = 4; //원점과 거리
        T.solution(k, d);
    }

    public long solution(int k, int d) {
        long answer = 0;
        for(int i = 0; i <= d; i += k)
        {
            long dd = (long) d * d;
            long ii = (long) i * i;
            int top = (int) Math.sqrt(dd - ii);
            answer += (top / k) + 1;
        }
        return answer;
    }
}
