import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class String06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputS1 = sc.next();

        String rs ="";
        for (int i = 0; i < inputS1.length(); i++) {
            if(inputS1.indexOf(inputS1.charAt(i))==i){
                rs += inputS1.charAt(i);
            }
        }
        System.out.println(rs);

//        char[] arrC = inputS1.toCharArray();
//        String[] arrS = new String[inputS1.length()];
//
//        for (int i = 0; i < inputS1.length(); i++) {
//            arrS[i] = String.valueOf(arrC[i]);
//        }
//
//        String[] rsArr = Arrays.stream(arrS).distinct().toArray(String[]::new);
//
//        System.out.println(Arrays.toString(arrS));

    }
}

