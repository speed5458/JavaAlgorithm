import java.util.Optional;
import java.util.Scanner;

public class String02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputS1 = sc.next();

        StringBuilder sb = new StringBuilder();
        for (char x: inputS1.toCharArray()) {
            if (Character.isUpperCase(x)){
                sb.append(Character.toLowerCase(x));
            }else{
                sb.append(Character.toUpperCase(x));
            }
        }

        System.out.println(sb.toString());



        /*for (char x: inputS1.toCharArray()) {
            if(Character.isUpperCase(x)){
                if(rsString == null){
                    rsString = Character.toString(Character.toLowerCase(x));
                }else{
                    rsString += Character.toString(Character.toLowerCase(x));
                }
            }else{
                if(rsString == null){
                    rsString = Character.toString(Character.toUpperCase(x));
                }else{
                    rsString += Character.toString(Character.toUpperCase(x));
                }
            }
        }*/

    }
}
