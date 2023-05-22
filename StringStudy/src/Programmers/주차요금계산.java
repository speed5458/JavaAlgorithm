package Programmers;

import java.sql.Time;
import java.util.*;

public class 주차요금계산 {
    public static void main(String[] args){
        주차요금계산 T = new 주차요금계산();
        int[] fees = {180, 5000, 10, 600}; //기본시간, 기본요금, 단위시간, 단위요금
        String[] records = {"05:34 5961 IN", "06:34 5961 OUT", "07:34 5961 IN",
                "08:34 5961 OUT", "09:34 5961 IN", "10:34 5961 OUT", "11:34 5961 IN", "12:34 5961 OUT"};

        T.solution(fees, records);
    }
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        Map<String, Integer> myRecords = new HashMap<>();
        Map<String, Integer> in = new HashMap<>();

        //차량별 시간을 기록하느 myRecords Map을 만든다.
        for (String s: records) {
            String[] splitRecords = s.split(" ");
            int m = TimeToMin(splitRecords[0]);
            String carNum = splitRecords[1];
            if(splitRecords[2].equals("IN")){
                in.put(carNum, m);
            }else{
                int useM = m - in.get(carNum);
                myRecords.put(carNum, myRecords.getOrDefault(carNum, 0) + useM);
                in.remove(carNum); //출차 in에서 삭제해준다.
            }
        }
        //출차하지 않은차 처리
        for (String carNum : in.keySet()) {
            int limitM = TimeToMin("23:59");
            int useM = limitM - in.get(carNum);
            myRecords.put(carNum, myRecords.getOrDefault(carNum, 0) + useM);
            //in.remove(carNum); //출차 in에서 삭제해준다.
        }


        List<String> keySet = new ArrayList<>(myRecords.keySet());
        Collections.sort(keySet); //자동차넘버 순대로 정렬
        List<Integer> feeList = new ArrayList<>();

        for (String carNum: keySet) {
            //기본시간보다 많이 주차했을경우
            if(myRecords.get(carNum) > fees[0]){
                double overT =  (double)(myRecords.get(carNum) - fees[0]) / fees[2]; //사용시간 올림처리
                int fee = (int) (fees[1] + Math.ceil(overT) * fees[3]);
                feeList.add(fee);
            }else{
                feeList.add(fees[1]);
            }
        }
        answer = feeList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }

    public int TimeToMin(String time){
        String[] splitT = time.split(":");
        String hourS = splitT[0];
        String minS = splitT[1];
        int convertMin = Integer.parseInt(hourS)*60 + Integer.parseInt(minS);
        return convertMin;
    }
}
