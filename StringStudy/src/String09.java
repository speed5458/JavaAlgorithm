import java.util.Scanner;

public class String09 {
    public static void main(String[] args){
        //g0en2T0s8eSoft
        Scanner sc = new Scanner(System.in);
        String inputS1 = sc.next();

        inputS1 = inputS1.replaceAll("[^0-9]","");
        System.out.println(Integer.parseInt(inputS1));

    }
}
