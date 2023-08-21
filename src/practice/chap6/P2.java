package practice.chap6;
// 문제6-1에서 정의한 StudaCard클래스에 두 개의 생성자와 info()를 추가해서 실행 결과와 같은 결과를 얻도록 하시오.

public class P2 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard();
        card1.num = 3;
        card1.Kwang = false;
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class SutdaCard {
    int num=1;
    boolean Kwang=true;

    String info(){
        if(Kwang) return num+"K";
        else return num+"";
        // return num + (Kwang?"K":"");
    }
}
