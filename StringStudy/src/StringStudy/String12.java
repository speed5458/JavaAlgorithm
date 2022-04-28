package StringStudy;

import java.util.Scanner;

public class String12 {
    //4 #****###**#####**#####**##**
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String answer = "";
        int num = 0;
        for (int i = 0; i < n; i++) {
            String temp = s.substring(0,7).replace('#','1').replace('*','0');
            num = Integer.parseInt(temp,2);
            answer += (char)num;
            s = s.substring(7);
        };

        System.out.println(answer);

    }
}
