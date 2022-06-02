package StackQue;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(solution(s));
    }
    public static int solution(String s){
        int answer = 0;
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                st.push(s.charAt(i)); //(일경우 push 해준다.
            }else{
                // ) 일경우
                if(s.charAt(i-1) == '('){
                    st.pop();
                    answer += st.size();
                }else{
                    st.pop();
                    answer += 1;
                }
                 // 이전 i-1 이랑 비교해서 ( 다 하면 st.pop() 해주고 answer 에다가 stack size 만큼 더해준다.
                // 이전 내용이 ) 면 answer += 1 을 해준다.
            }
        }

        return answer;
    }
}
