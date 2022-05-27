package StackQue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


//CBA
//CBDAGE
public class 교육과정설계 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(solution(s1, s2));
    }
    public static String solution(String s1, String s2){
        String answer = "YES";
        Queue<Character> que1 = new LinkedList<>();

        for (int i = 0; i < s1.length(); i++) {
            //미리 CBA를 QUE에 넣는다.
            que1.offer(s1.charAt(i));
        }
        //s2 하나씩 돌면서 Contain 으로 있는지 확인
        for(char x : s2.toCharArray()){
            if(que1.contains(x)){
                if(x != que1.poll()) return "NO";
            }
        }
        //있으면 poll 해서 s2 문자열이랑 비교하고  다르면 NO
        if(!que1.isEmpty()) return "NO";
        return answer;
    }
}
