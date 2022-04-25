import java.util.Scanner;

public class String01 {
    public static void main(String[] args){
        int count = 0;
        Scanner in=new Scanner(System.in);
        String inputS1 = in.next();
        char inputS2 = in.next().charAt(0);

        for (int i = 0; i < inputS1.length(); i++) {
            if(Character.toLowerCase(inputS1.charAt(i)) == Character.toLowerCase(inputS2)){
                count++;
            }
        }
        System.out.println(count);
    }
}
