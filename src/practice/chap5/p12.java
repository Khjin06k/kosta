package practice.chap5;

public class p12 {
    public static void main(String[] args) {
        // 3M짜리 우물 바닥에 달팽이가 있다.
        // 달팽이는 낮동안 52cm를 올라올 수 있다.
        // 날이 지면 잠을 자야한다.
        // 자는 동안 미끄러져 3cm가 내려간다.
        // 달팽이가 다 올라오기 위해서 몇일이 필요한가? >> 7일
        int day = 0;
        int m = 0;
        while(m<300){
            day++;
            m += 55;
            if(m >= 300) break;
            else m -= 3;
        }
        System.out.println(day);
    }
}
