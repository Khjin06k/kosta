package java.javaFinalExample.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TestMain03 {
    public static void main(String[] args) {
        String str = "1.22,4.12,5.93,8.71,9.34";

        float total = 0;
        float avg = 0;
        //StringTokenizer 이용하여 List에 저장한다.
        StringTokenizer s = new StringTokenizer(str, ",");
        List<Float> list = new ArrayList<>();
        while(s.hasMoreTokens()){
            float num = Float.parseFloat(s.nextToken());
            list.add(num);
            total += num;
        }
        //List에 저장된 데이터의 합과 평균을 구한다.
        System.out.printf("합계: %5.3f \n", total);
        System.out.printf("평균: " + total/list.size());
    }
}
