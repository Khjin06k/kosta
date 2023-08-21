package practice.chap6;
// 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
public class P8_PlayingCard {
    int kind;
    int num;

    static int width;
    static int height;

    P8_PlayingCard(int k, int n){
        kind = k;
        num = n;
    }
    public static void main(String[] args) {
        P8_PlayingCard card = new P8_PlayingCard(1,1);
    }
}

/*
클래스 변수 (static 변수) : width, height
인스턴스 변수 : kind, num
지역 변수 : k, n
 */