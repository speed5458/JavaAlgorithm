package StringStudy;

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
            //indexOf 는 그 Char 의 맨앞 index 를 반환한다. i 진행도랑 다르면 두번쨰 이상 발견되는거니까 가능
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

