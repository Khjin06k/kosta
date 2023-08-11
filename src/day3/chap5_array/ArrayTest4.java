package day3.chap5_array;

import java.util.Arrays;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] ball = new int[6];

        // 1~45 중 하나의 랜덤 숫자를 뽑아 rand에 저장
        // rand값을 배열에 저장하나, 배열에 이미 저장된 값이면 이를 넣지 않음
        int i = 0;
        while(i != 6){
            int rand = (int)(Math.random()*45)+1;
            if(Arrays.asList(ball).contains(rand)) continue;
            // 위 처럼 공식이 아닌 반복문을 이용해서 같은 값이 존재하는지 확인 가능
            else{
                ball[i] = rand;
                i++;
            }
        }

        /*
        int cnt = 0;
        boolean same;
        while(true){
            int rnad = (int) (Math.random()*45)+1;
            same = false;
            // ball에 rand값과 동일한 값이 있는지 확인
            // 전체적으로 비교할 필요없이 이미 뽑힌 갯수만큼만 비교하면 되기 때문에 cnt를 사용
            for(int i = 0; i<cnt; i++){
                if(ball[i] == rand){
                    same = true;
                    break;
                }
            }
            if(same == fasle){
                ball[cnt++] = rand;
            }
            if(cnt == 6) break;
        }
        */

        // ball의 값을 출력
        for(int j = 0; j<ball.length; j++){
            if(j == ball.length-1){
                System.out.print(ball[j]);
                break;
            }
            System.out.print(ball[j]+", ");
        }




    }
}
