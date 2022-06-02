package StackQue;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));

    }

    public static int solution(String s){
        int answer = 0;
        //숫자면 스택에 담는다.
        //연산자만나면 스택에서 꺼내 rt 에 담고 나중에 나온건 lt
        // lt - rt 를 해줘야 한다.
        //연산하고 다시 stack에 담아둔다.

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                    st.push(s.charAt(i)-48);
            }else{
                int rt = st.pop();
                int lt = st.pop();
                if(s.charAt(i) == '+') st.push(lt+rt);
                else if(s.charAt(i) == '-') st.push(lt-rt);
                else if(s.charAt(i) == '*') st.push(lt*rt);
                else if(s.charAt(i) == '/') st.push(lt/rt);
            }
        }
        answer = st.pop();

        return answer;
    }
}
