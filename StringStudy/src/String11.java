import java.util.Scanner;

public class String11 {
    public static void main(String[] args){
        //KKHSSSSSSSE K2HS7E
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String answer = "";
        s = s + " ";
        int cnt = 1;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)){
                cnt++;
            }else{
                answer += s.charAt(i);
                if(cnt >1){
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        System.out.println(answer);
        }
    }
