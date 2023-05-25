package Programmers;

public class 나머지가1이되는수찾기 {
    public static void main(String[] args){
        나머지가1이되는수찾기 T = new 나머지가1이되는수찾기();
        int n = 10;
        T.solution(n);


    }
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++) {
            if(n % i  == 1){
                return i;
            }
        }
        return answer;
    }

}
