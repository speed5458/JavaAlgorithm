package StackQue;

import java.util.*;

public class 크레인인형뽑기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(solution(n, board, m, moves));


    }


    public static int solution(int n, int[][] board, int m, int[] moves){
        int answer = 0, picker = 0;

        ArrayList<Queue<Integer>> rsList = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        //배열을 Que 에 담아준다.
        for (int i = 0; i < n; i++) {
            Queue<Integer> qu = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                //0이 아닐때만 담아준다.
                if(board[j][i] != 0) qu.offer(board[j][i]);
            }
            //que 객체를 List 에 담아준다.
            rsList.add(qu);
        }
// 4 3 1 1 3 2 4
        for (int i = 0; i < m; i++) {
            if(rsList.get(moves[i] -1).peek() == null) continue;
            int getItem = rsList.get(moves[i] -1).poll();

            if(st.size() !=0 && getItem == st.peek()){
                st.pop();
                answer += 2;
            }else{
                st.push(getItem);
            }
        }

        return answer;
    }
}
