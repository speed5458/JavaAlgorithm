package Programmers;

import java.util.ArrayList;
import java.util.List;

public class 모음사전2 {
    public static void main(String[] args){
        모음사전2 T = new 모음사전2();
        T.solution("UUUUU");
    }
    List<String> dict;
    String[] pos = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
        int answer;
        dict = new ArrayList<>();
        dfs("");
        answer = dict.indexOf(word);
        return answer;
    }

    private void dfs(String str) {
        dict.add(str);
        if(str.length() >= pos.length) {
            return;
        }
        for (String s : pos) {
            dfs(str + s);
        }
    }
}
