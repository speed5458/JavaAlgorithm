package Programmers;

public class 이모티콘할인행사 {

    static int[] salePercent = {10, 20, 30, 40}; //할인률 10% ~ 40%
    static int maxCnt = 0, maxPrice = 0;

    public static void main(String[] args) {
        이모티콘할인행사 T = new 이모티콘할인행사();
        int[] emoticons = {1300, 1500, 1600, 4900}; // 이모티콘 : 가격
        int[][] users = {{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}}; //사용자 : 최대비율, 가격

        T.solution(users, emoticons);
    }
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = {};
        // 할인률 별 조합의 수를 따져야된다.
        dfs(0, new int[emoticons.length], emoticons, users);

        answer = new int[2];
        answer[0] = maxCnt;
        answer[1] = maxPrice;


        return answer; //가입수 매출액 출력
    }
    public void dfs(int L, int[] salePerCombi, int[] emoticons, int[][] users) {
        if(L == emoticons.length){
            //조합이 구해졌으면 나가서 합산을 해본다.
            calc(salePerCombi, emoticons, users);
            return;
        }
        for (int i = 0; i < salePercent.length; i++) {
            salePerCombi[L] = salePercent[i];
            dfs(L+1, salePerCombi, emoticons, users);
        }
    }
    public void calc(int[] salePerCombi, int[] emoticons, int[][] users){
        int totPrice = 0;
        int cnt = 0;
        for (int i = 0; i < users.length; i++) {
            int[] tempUser = users[i];
            int userPer = tempUser[0];
            int userPrice = tempUser[1];
            double sum = 0;
            for (int j = 0; j < emoticons.length; j++) {
                //해당 인덱스의 가격 을 적용하는데 userPer보다 크거나 같으면 연산 아니면 기존값으로 연산
                if(userPer <= salePerCombi[j]){
                    //크면 saleperCombi의 할인률로 계산
                    sum += emoticons[j] * (1.0 - (double)salePerCombi[j]/100.0);
                }else{
                    //아니면 안삼
                    //sum += emoticons[j];
                }
            }
            //가격합이 users배열에 들어있는 값보다 크면 cnt를 더하고 아니면 totPrice 에 sum을 해준다.
            if(sum >= userPrice){
                cnt ++;
            }else{
                totPrice += sum;
            }
        }
        //calc 메서드에서 돌린결과가 현재 저장된 maxCnt값보다 더 크면 cnt와 totPrice 값변경
        if(cnt > maxCnt){
            maxCnt = cnt;
            maxPrice = totPrice;
        }else if (cnt == maxCnt){
            maxPrice = Math.max(maxPrice, totPrice);
        }
    }
}


