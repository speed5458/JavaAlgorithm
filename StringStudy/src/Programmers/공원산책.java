package Programmers;

public class 공원산책 {
    public static void main(String[] args){
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};
        공원산책 T = new 공원산책();
        T.solution(park, routes);
    }
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};


        char[][] map = new char[park.length][park[0].length()]; //3 3
        Node node = new Node();

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = park[i].toCharArray()[j];
                if(park[i].toCharArray()[j] == 'S'){
                    node.setX(j);
                    node.setY(i);
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String[] routesSplit = routes[i].split(" ");
            if(mapSearch(map, node, Integer.parseInt(routesSplit[1]), routesSplit[0])){
                if(routesSplit[0].equals("E")){
                    node.setX(node.getX()+Integer.parseInt(routesSplit[1]));
                } else if (routesSplit[0].equals("W")) {
                    node.setX(node.getX()-Integer.parseInt(routesSplit[1]));
                } else if (routesSplit[0].equals("S")) {
                    node.setY(node.getY()+Integer.parseInt(routesSplit[1]));
                } else if (routesSplit[0].equals("N")) {
                    node.setY(node.getY()-Integer.parseInt(routesSplit[1]));
                }
            }

        }
        answer=new int[2];
        answer[0] = node.getY();
        answer[1] = node.getX();
        return answer;
    }

    public boolean mapSearch(char[][]map, Node node, int i, String d){
        boolean flag = true;
        for (int j = 1; j <= i; j++) {
            if(d.equals("E")){
                if(node.getX()+j >= map[0].length) {
                    flag = false;
                    break;
                }
                char tempC = map[node.getY()][node.getX()+j];
                if(tempC == 'X') {
                    flag = false;
                }
            }else if (d.equals("W")){
                if(node.getX()-j < 0) {
                    flag = false;
                    break;
                }
                char tempC = map[node.getY()][node.getX()-j];
                if(tempC == 'X') {
                    flag = false;
                }
            }else if (d.equals("S") ){
                if(node.getY()+j >= map.length) {
                    flag = false;
                    break;
                }
                char tempC = map[node.getY()+j][node.getX()];
                if(tempC == 'X') {
                    flag = false;
                }
            }else if (d.equals("N")){
                if(node.getY()-j < 0) {
                    flag = false;
                    break;
                }
                char tempC = map[node.getY()-j][node.getX()];
                if(tempC == 'X') {
                    flag = false;
                }
            }
        }
        return flag;
    }

}
class Node{
    int x;
    int y;

    public Node() {
    }
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
