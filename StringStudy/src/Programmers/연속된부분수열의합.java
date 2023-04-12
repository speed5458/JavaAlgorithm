package Programmers;

import java.util.*;

public class 연속된부분수열의합 {

    public static void main(String[] args){
        연속된부분수열의합 T = new 연속된부분수열의합();
        int[] sequence = {1, 1, 1, 2, 3, 4, 5};
        int k = 5;
        T.solution(sequence, k);

    }
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int lt = 0, sum = 0;
        List<answerObject> answerObjectArr = new ArrayList<>();
        for (int rt = 0; rt < sequence.length; rt++) {
            sum += sequence[rt];
            if(sum == k) answerObjectArr.add(new answerObject(lt,rt));
            while(sum >= k){
                sum -= sequence[lt++];
                if(sum == k) answerObjectArr.add(new answerObject(lt,rt));
            }
        }
        answerObjectArr.sort(Comparable::compareTo);
        answer[0] = answerObjectArr.get(0).lt;
        answer[1] = answerObjectArr.get(0).rt;
        return answer;
    }
}

class answerObject implements Comparable<answerObject>{
    int lt;
    int rt;
    int size;

    public answerObject(int lt, int rt) {
        this.lt = lt;
        this.rt = rt;
        this.size = rt - lt;
    }
    @Override
    public int compareTo(answerObject o) {
        if(this.size == o.size){
            return this.lt - o.lt;
        }

        return this.size - o.size;
    }
}
