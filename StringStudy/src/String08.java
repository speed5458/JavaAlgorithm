import java.util.Locale;
import java.util.Scanner;

public class String08 {
    public static void main(String[] args){
        String rsAnswer = "YES";
        Scanner sc = new Scanner(System.in);
        String inputS1 = sc.nextLine();

        inputS1 = inputS1.toUpperCase().replaceAll("[^A-Z]","");
        String reverseInpuS1 = new StringBuilder(inputS1).reverse().toString();

        if(!reverseInpuS1.equalsIgnoreCase(inputS1)){
            rsAnswer = "NO";
        }

        System.out.println(rsAnswer);

    }
}
