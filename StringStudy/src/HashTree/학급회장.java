package HashTree;
import java.util.HashMap;
import java.util.Scanner;

public class 학급회장 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String st = sc.next();
        System.out.print(solution(st, n));

    }
    public static Character solution(String st, int n){
        String answer = "";
        HashMap<Character, Integer> rsMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if(rsMap.containsKey(st.charAt(i))){
                rsMap.put(st.charAt(i), rsMap.get(st.charAt(i))+1);
            }else{
                rsMap.put(st.charAt(i), 0);
            }

        }


        return rsMap.entrySet().stream()
                            .max((m1, m2) -> m1.getValue() > m2.getValue() ? 1 : -1)
                            .get()
                            .getKey();
    }
}
