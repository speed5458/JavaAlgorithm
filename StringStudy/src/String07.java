import java.util.Arrays;
import java.util.Scanner;

public class String07 {
    public static void main(String[] args){
        String rsAnswer = "YES";
        Scanner sc = new Scanner(System.in);
        String inputS1 = sc.next();
        String reverseInputS1 = new StringBuilder(inputS1).reverse().toString();


        if(inputS1.equalsIgnoreCase(reverseInputS1)){
            rsAnswer = "YES";
        }else{
            rsAnswer = "NO";
        }

        System.out.println(rsAnswer);


    }
}
