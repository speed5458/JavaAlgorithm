package Programmers;

import java.util.*;

public class 과제진행하기 {
    public static void main(String[] args){
        과제진행하기 T = new 과제진행하기();
        String[][] plans = {{"korean", "11:40", "30"}, {"english", "12:10", "20"}, {"math", "12:30", "40"}};
        T.solution(plans);
    }

    public String[] solution(String[][] plans) {
        String[] answer = new String[plans.length];
        Node[] myPlans = new Node[plans.length];

        for (int i = 0; i < plans.length; i++) {
            String[] splitTime = plans[i][1].split(":");
            int chgTime = Integer.parseInt(splitTime[0]) * 60 + Integer.parseInt(splitTime[1]);
            myPlans[i] = new Node(  i ,
                            Integer.parseInt(splitTime[0]) * 60 + Integer.parseInt(splitTime[1]) ,
                                    Integer.parseInt(plans[i][2]));
        }
        //시간순 배열 정렬
        Arrays.sort(myPlans, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.stTime - o2.stTime;
            }
        });

        Stack<Node> remain = new Stack<>();
        List<String> tempAnswer = new ArrayList<>();

        for (int i = 0; i < plans.length-1; i++) {
            int curT = myPlans[i].stTime + myPlans[i].remainTime;
            int nextT = myPlans[i+1].stTime;

            if(curT <= nextT){
                tempAnswer.add(plans[myPlans[i].index][0]);
                //짜투리 시간 확인
                int jjaturi = nextT - curT;
                //짜투리 시간이 존재하고 스택에 작업이 남았을경우
                while (jjaturi > 0 && !remain.isEmpty()){
                    //짜투리 시간과 남은 작업의 작업시간 확인
                    int del = remain.peek().remainTime - jjaturi;
                    remain.peek().remainTime = Math.max(0, del);
                    //짜투리 시간이 더 많음으로 스택 삭제 하고 짜투리 시간 변경
                    if(del <= 0){
                        jjaturi = -1 * del;
                        tempAnswer.add(plans[remain.pop().index][0]);
                    }else{
                        jjaturi = 0;
                    }
                }

            }else{
                //스택 하나 추가
                myPlans[i].remainTime = curT - nextT;
                remain.push(myPlans[i]);
            }
        }
        tempAnswer.add(plans[myPlans[myPlans.length-1].index][0]);

        while(!remain.isEmpty()){
            tempAnswer.add(plans[remain.pop().index][0]);
        }

        answer = tempAnswer.toArray(new String[tempAnswer.size()]);

        return answer;
    }
}
class Node{
    int index;
    int stTime;
    int remainTime;

    public Node(int index, int stTime, int remainTime) {
        this.index = index;
        this.stTime = stTime;
        this.remainTime = remainTime;
    }
}