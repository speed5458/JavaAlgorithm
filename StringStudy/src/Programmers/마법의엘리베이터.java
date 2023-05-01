package Programmers;
public class 마법의엘리베이터 {
    public static void main(String[] args){
        int storey = 2554;
        마법의엘리베이터 T = new 마법의엘리베이터();
        T.solution(storey);
    }
    public int solution(int storey) {
        int answer = 0;
        //storey가 0이 될때까지 돌린다.
        while (storey != 0){
            int cur = storey % 10;
            int next = (storey / 10) % 10;
            if(cur > 5){
                answer += 10 - cur; //6이면 4만큼 버튼을 누른거다.
                storey += 10;
            }else if(cur == 5){
                //앞자리가 4이하면 현재자리수의 5는 빼는게 이득 앞자리가 6이면 현재자리 5는 더하는게 이득
                answer += 5; //cur가 5면 더하거나 빼는건 카운팅이 똑같은데 next 숫자만 더해줄지 그냥 냅둘지 정하면됨
                if(next >= 5){
                    storey += 10; //next가 5보다 크면 10을 더해주면 현재 storey에서 next +1 이된다.
                }else{
                    storey += 0; //5보다 작으면 기냥 냅둔다.
                }
            }else{
                answer += cur;
            }
            storey /= 10; //1의 자리숫자는 계산된거니까 날려준다.
        }
        return answer;
    }
}
