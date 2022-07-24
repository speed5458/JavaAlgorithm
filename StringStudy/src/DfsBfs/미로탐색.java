package DfsBfs;

import java.util.Scanner;

public class 미로탐색 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {-1,0,1,0};
    static int[][] map;
    static int answer = 0;

    public void DFS(int x, int y){
        if(x ==7 && y == 7){
            answer++;
        }else{
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 1 && nx <=7 && ny >=1 && ny <=7 && map[nx][ny] == 0){
                    map[nx][ny] = 1;
                    DFS(nx, ny);
                    map[nx][ny] = 0;
                }
            }
        }


    }

    public static void main(String[] args){
        미로탐색 T = new 미로탐색();
        Scanner sc = new Scanner(System.in);
        map = new int[8][8];
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        map[1][1] = 1;
        T.DFS(1,1);
        System.out.println(answer);
    }
}

