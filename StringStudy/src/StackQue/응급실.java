package StackQue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}



public class 응급실 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arrI = new int[n];
        for (int i = 0; i < n; i++) {
            arrI[i] = sc.nextInt();
        }
        System.out.println(solution(n,m,arrI));

    }

    public static int solution(int n, int m, int[] arrI){
        int answer = 0;
        Queue<Person> que = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            que.offer(new Person(i, arrI[i]));
        }
        //que 가 빌때까지 돈다.
        while(!que.isEmpty()){
            //꺼냈을때 나머지보다 작으면 맨뒤로 다시 넣는다.
            Person temp = que.poll();
            //나머지와 비교
            for (Person x: que) {
                if(temp.priority < x.priority){
                    que.offer(temp);
                    temp = null;
                    break;
                }
            }
            //null이 아니면 더큰 숫자가 없다 진료순서 answer +=1
            if(temp != null){
                answer ++;
                if(temp.id == m) return answer;
            }
        }

        return answer;
    }


}
