package HashTree;

import java.util.HashMap;
import java.util.Scanner;

public class 모든아나그램찾기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();
        String st2 = sc.next();
        System.out.print(solution(st1, st2));
    }

    public static int solution(String st1, String st2){
        int answer = 0, lt = 0;
        HashMap<Character, Integer> aHmap = new HashMap<>();
        HashMap<Character, Integer> bHmap = new HashMap<>();

        for (int i = 0; i < st2.length()-1; i++) { //SlidingWindow 탐색할 배열을 미리 st2.length-1 개 넣어 해준다.
            bHmap.put(st1.charAt(i), bHmap.getOrDefault(st1.charAt(i), 0)+1);
        }

        for (int i = 0; i < st2.length(); i++) { // 기준이 되는 HashMap 을 넣어준다.
            aHmap.put(st2.charAt(i), aHmap.getOrDefault(st2.charAt(i), 0) + 1);
        }

        for (int rt = st2.length()-1; rt < st1.length(); rt++) { // SlidingWindow 로 탐색하면서 aHmap 하고 비교를 해준다. 같으면 answer++
            bHmap.put(st1.charAt(rt),bHmap.getOrDefault(st1.charAt(rt),0)+1);
            if(aHmap.equals(bHmap)) answer++;
            bHmap.put(st1.charAt(lt),bHmap.getOrDefault(st1.charAt(lt),0)-1);
            bHmap.values().remove(0);
            lt++;
        }

        return answer;
    }
}
