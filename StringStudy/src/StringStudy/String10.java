package StringStudy;

import java.util.Arrays;
import java.util.Scanner;

//teachermode e
public class String10 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     String inputS1 = sc.next();
     char c = sc.next().charAt(0);
    int p = 1000;
    int[] answer = new int[inputS1.length()];
        for (int i = 0; i < inputS1.length(); i++) {
            if(inputS1.charAt(i) == c){
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int j = inputS1.length()-1; j >= 0; j--) { 
            if(inputS1.charAt(j) == c){
                p = 0;
            }else{
                p++;
                answer[j] = Math.min(answer[j], p);
            }
        }
        for (int x: answer  ) {
            System.out.print(x + " ");
        }
    }
}
// 1, 5, 10