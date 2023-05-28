package Programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 모음사전 {
    static int cnt;
    static String[] pm;
    static String[] pos = {"A","E","I","O","U"};
    static boolean flag;
    public static void main(String[] args){
        모음사전 T = new 모음사전();
        String word = "UUUUUU";
        T.solution(word);
    }
    public int solution(String word) {
        pm = new String[pos.length];
        flag = false;
        cnt = 0;
        //dfs 탐색으로 조합의 수를 만들자.
        dfs(0, pos.length, word);
        return cnt;
    }

    public void dfs(int L, int limit, String word) {
        checkWord(pm, word);
        if(flag) return;
        if(L >= limit) return;
        for (int i = 0; i < pos.length; i++) {
            checkWord(pm, word);
            if(flag) return;
            pm[L] = pos[i];
            cnt++;
            dfs(L+1, limit, word);
            pm[L] = "";
        }
    }
    public void checkWord(String[] pmArr, String word){
        String tempS = "";
        tempS = Arrays.stream(pmArr).collect(Collectors.joining());
        if(tempS.equals(word)){
            flag = true;
        }
    }
}
