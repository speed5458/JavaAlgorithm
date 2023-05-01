package Programmers;

public class 택배배달과수거하기 {
    public static void main(String[] args){
        택배배달과수거하기 T = new 택배배달과수거하기();

        int cap = 4; //상차할수있는 택배 개수
        int n= 5; // 배달지점 개수
        int[] deliveries = {1, 0, 3, 1, 2};
        int[] pickups = {0, 3, 0, 4, 0};
        T.solution(cap, n, deliveries, pickups);
    }
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        int d = 0, p = 0;

        //맨뒤에서부터 탐색
        for (int i = n-1; i >= 0; i--) {
            d += deliveries[i]; //배달
            p += pickups[i]; //픽업

            //0보다 클경우는 배달을 와야되는 지점임 0보다 작을때까지 계속돌림
            while (d > 0 || p > 0){
                d -= cap;
                p -= cap;
                answer += (i +1) * 2;
            }
        }
        return answer;
    }
}
