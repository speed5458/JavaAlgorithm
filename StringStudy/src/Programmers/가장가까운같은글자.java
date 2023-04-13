package Programmers;

public class 가장가까운같은글자 {
    public static void main(String[] args){

        가장가까운같은글자 T = new 가장가까운같은글자();
        String s = "bananabananabananabanana";
        T.solution(s);
    }

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String compare = "";

        for (int i = 0; i < s.length(); i++) {
            int index = compare.lastIndexOf(s.substring(i,i+1));
            System.out.println(s.substring(i,i+1) + " :: "+ index);
            if(index == -1){
                answer[i] = - 1;
            }else{
                answer[i] = i - index;
            }
            compare += s.substring(i , i+1);
        }

        return answer;
    }

}
