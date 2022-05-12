package HashTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 아나그램 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();
        String st2 = sc.next();

        System.out.print(solution(st1, st2));
    }

    public static String solution(String st1, String st2){
        String answer = "YES";
        HashMap<Character, Integer> st1Map = new HashMap<>();
        HashMap<Character, Integer> st2Map = new HashMap<>();

        for (int i = 0; i < st1.length(); i++) {
            st1Map.put(st1.charAt(i), st1Map.getOrDefault(st1.charAt(i), 0) + 1);
            st2Map.put(st2.charAt(i), st2Map.getOrDefault(st2.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry: st1Map.entrySet()) {
            if(st2Map.containsKey(entry.getKey())){
                if(st2Map.get(entry.getKey()) != entry.getValue()) answer = "NO";
            }else{
                answer = "NO";
            }
        }



        return answer;
    }
}
