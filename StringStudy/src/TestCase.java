import java.util.*;

public class TestCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();// 입력

        Random rd = new Random();
        int comCase = rd.nextInt(2);
        //0 ~ 2

        //유저 입력값 변형
        HashMap<String, Integer> hMap = new HashMap<>();
        hMap.put("가위", 0);
        hMap.put("바위", 1);
        hMap.put("보", 2);


        System.out.println("유저 :: " + hMap.get(st1));
        System.out.println("컴퓨터 출력 :: " + comCase);
        //가위 = 0 바위 = 1 보 = 2

        //승자 결정
        String[] rsWinner = {"유저가 이겼다", "컴퓨터가 이겼다", "비겼다"};
        int rsInt = winner(hMap.get(st1), comCase);
        System.out.println(rsWinner[rsInt]);

        List<Integer> rsWinNum = new ArrayList<>();
        rsWinNum.add(1);
        rsWinNum.add(0);
        rsWinNum.add(1);
        rsWinNum.add(0);
        rsWinNum.add(2);
        rsWinNum.add(0);
        int winnerCnt = 0;
        int loseCnt = 0;
        for (int i = 0; i < rsWinNum.size(); i++) {
            if(rsWinNum.get(i) == 0 ){
                winnerCnt ++;
            }else if(rsWinNum.get(i) == 1){
                loseCnt ++;
            }
        }
    }
    public static int winner(int user, int com){
        int answer =0;
        if(user == com) return 2;

        if(user==0 && com == 1){
            answer = 1;
        } else if (user == 1 && com == 2) {
            answer = 1;
        }else if (user == 2 && com == 0){
            answer = 1;
        }

        return answer;
    }
}
