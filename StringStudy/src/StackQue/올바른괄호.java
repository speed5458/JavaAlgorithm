package StackQue;

import java.util.Scanner;
import java.util.Stack;

// (()(()))(()
public class 올바른괄호 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));

    }
    public static String solution(String s){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }else{
                if (stack.size() == 0) {
                    answer = "NO";
                }else{
                    stack.pop();
                }
            }
        }
        if (stack.size() != 0) answer = "NO";


        return answer;
    }
}
