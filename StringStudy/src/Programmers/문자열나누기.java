package Programmers;

public class 문자열나누기 {
    public static void main(String[] args){
        문자열나누기 T = new 문자열나누기();
        String s = "abracadabra";
        T.solution(s);
    }

    public int solution(String s) {
        int answer = 0;

        while (s.length() != 0) {
            answer++;

            char ch = s.charAt(0);
            int sCount = 1;
            int dCount = 0;


            for (int i = 1; i < s.length(); i++) {
                if (ch == s.charAt(i))
                    sCount++;
                else
                    dCount++;

                if (sCount == dCount)
                    break;
            }

            s = s.substring(sCount + dCount);
        }

        return answer;
    }
}

