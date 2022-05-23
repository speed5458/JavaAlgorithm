package StackQue;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {

    //(A(BC)D)EF(G(H)(IJ)K)LM(N)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(solution1(s));
    }

    public static String solution1(String s){
        String answer = "";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) { //
            if(s.charAt(i) == '(' || s.charAt(i) == ')'){
                //1.  ( 일경우 stack 에 추가
                if(s.charAt(i) == '(') st.push(s.charAt(i));
                //2.  ) 일경우 stack에서 ( 해제
                if(s.charAt(i) == ')') st.pop();
            }else{
                if(st.size() == 0){
                    answer += s.charAt(i);
                }
            }
        }
        return answer;
    }
    public static String solution2(String s){
        String answer = "";
        Stack<Character> st = new Stack<>();
        for (char x : s.toCharArray()) {
            if(x == ')'){
                while(st.pop()!='(');
            }else{
                st.push(x);
            }
        }
        for (int i = 0; i < st.size(); i++) {
            answer += st.get(i);
        }
        return answer;
    }
}
