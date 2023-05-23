package Programmers;

public class 피로도 {
    static int[] ch;
    static int[][] pm;
    static int temp;
    public static void main(String[] args){
        피로도 T = new 피로도();
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        T.solution(k, dungeons);
    }
    public int solution(int k, int[][] dungeons) {
        int m = dungeons.length;
        ch = new int[m]; //체크배열
        pm = new int[m][2]; //조합된 던전을 넣을 배열
        dfs(0, m, dungeons, k);
        return temp;
    }
    public void dfs(int L, int m, int[][] dungeons, int k){
        if(L == m){ //던전조합이 완료
            //pm을 순서대로 돌면서 결과를 구한다.
            int rs = calc(pm, k);
            temp = Math.max(rs, temp); // 최대로 돌수있는 던전의 개수를 구한다.
        }else{
            for (int i = 0; i < m; i++) {
                if(ch[i] == 0){ //방문하지 않은곳은 0
                    ch[i] = 1; //방문하면 1
                    pm[L] =dungeons[i];
                    dfs(L+1, m, dungeons, k);
                    ch[i] = 0; //백트레킹 해준다.
                }
            }
        }
    }

    //조합된 pm으로 돌수있는 던전의 횟수
    public int calc(int[][] pm, int k){
        int cnt = 0;
        for (int i = 0; i < pm.length; i++) {
            int[] inD = pm[i];
            int min = inD[0];
            int pay = inD[1];
            if(k >= min){ //던전입장
                k -= pay;
                cnt++;
            }else{
                return cnt;
            }
        }
        return cnt;
    }


}
