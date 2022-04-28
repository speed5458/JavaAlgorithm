package StringStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class String03 {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = bf.readLine().split(" ");

        String maxStr = Arrays.asList(arr).stream().
                max(Comparator.comparing(String::length)).orElse(null);

        System.out.println(maxStr);
    }
}
