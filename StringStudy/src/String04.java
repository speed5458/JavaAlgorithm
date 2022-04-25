import java.util.Arrays;
import java.util.Scanner;

public class String04 {
    public static void main(String[] args){
        StringBuilder sb;
        Scanner sc = new Scanner(System.in);
        int inputArrLength = sc.nextInt();
        String[] arr = new String[inputArrLength];
        String[] rsArr = new String[inputArrLength];

        for (int i = 0; i < inputArrLength; i++) {
            arr[i] = sc.next();
        }

        for (int k = 0; k < arr.length; k++) {
            String rs = arr[k];
            sb = new StringBuilder();
            for (int j = rs.length()-1; j >= 0; j--) {
                sb.append(rs.charAt(j));
            }
            rsArr[k] = sb.toString();
        }
            Arrays.stream(rsArr).forEach(x -> System.out.println(x) );



    }
}
