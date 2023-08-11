package day3.chap5_array;

public class ArrayTest3 {
    public static void main(String[] args) {
        // int 타입 45개 배열을 선언
        int[] ball = new int[45];

        // goal의 배열에 1부터 45까지의 값으로 초기화 진행
        for(int i = 0; i<ball.length; i++){
            ball[i] = i+1;
        }

        // 랜덤으로 인덱스 값을 선택한 후 해당 값들을 서로 교환함
        for(int i = 0; i<1000; i++){
            // 0~44 중 임의의 정수값을 구해 변수에 각각 저장함
            // Math.randon() : 0.0 <= random < 1.0이기 때문에 44까지 포함하기 위해서는 45를 곱해줘야 함
            int idx = (int)(Math.random()*45);
            int idx2 = (int)(Math.random()*45);

            // 인덱스 0번과 랜덤한 j의 값의 위치를 변경
            int tmp = ball[idx];
            ball[idx] = ball[idx2];
            ball[idx2] = tmp;
        }

        // 섞인 배열의 값에서 1~6번째 값을 가져옴
        for(int i = 0; i<6; i++){
            // 마지막 값 뒤에 쉼표가 나오지 않도록 설정
            if(i==5) {
                System.out.print(ball[i]);
                break;
            }
            System.out.print(ball[i] + ", ");
        }
    }
}
