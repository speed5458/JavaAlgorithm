package Programmers;

public class 옹알이2 {
    public static void main(String[] args){
        옹알이2 T= new 옹알이2();
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        T.solution(babbling);
    }
    public int solution(String[] babbling) {
        int answer = 0;
        for (String s : babbling) {
            //한번만 쓸수있으므로 두번이상 중복되는 문자열은 오답처리 하기위해서
            s = s.replaceAll("ayaaya|yeye|woowoo|mama", " ");
            s = s.replaceAll("aya|ye|woo|ma", "");
            if (s.equals(""))
                answer++;
        }
        return answer;
    }
}
