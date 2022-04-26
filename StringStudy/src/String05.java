import java.util.Scanner;

//특정문자 뒤집기
public class String05 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputS1 = sc.next();

        char[] arrC = inputS1.toCharArray();

        int lt = 0;
        int rt = arrC.length;

        while(lt > rt){
            char temp = arrC[lt];
            arrC[lt] = arrC[rt];
            arrC[rt] = temp;
            lt ++;
            rt --;
        }

        for (char x: arrC) {
            System.out.print(x);
        }


    }

}
