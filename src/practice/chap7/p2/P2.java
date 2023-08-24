package practice.chap7.p2;

// 문제7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
//[주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
//1. 메서드명 : shuffle
//기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
// 반환타입 : 없음
//매개변수 : 없음
//2. 메서드명 : pick
//기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
// 반환타입 : SutdaCard
//매개변수 : int index - 위치
//3. 메서드명 : pick
//기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
// 반환타입 : SutdaCard
//매개변수 : 없음
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    SutdaDeck() {
        for(int i = 0; i<cards.length; i++){
            int num = (int)(Math.random()*10)+1;
            if(num == 1 || num == 3 || num == 8) cards[i] = new SutdaCard(num, true);
            else cards[i] = new SutdaCard(num, false);
        }
    }

    // cards 배열을 무작위로 섞음
    public void shuffle(){
        for(int i = 0; i<100; i++){
            int idx1 = (int)(Math.random()*20);
            int idx2 = (int)(Math.random()*20);
            SutdaCard tmp = cards[idx1];
            cards[idx2] = cards[idx1];
            cards[idx2] = tmp;
        }
        /*
        강사님 코드 >> 반복 횟수를 제외하고는 동일
         */
    }

    // 매개변수로 주어진 인덱스의 cards를 반환
    public SutdaCard pick(int index){
        return cards[index];
    }

    // 임의의 위치에 있는 cards를 반환
    public SutdaCard pick(){
        int index = (int)(Math.random()*20);
        return cards[index];
    }

} // SutdaDeck

class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

public class P2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        for(int i=0; i < deck.cards.length;i++) System.out.print(deck.cards[i]+",");
        System.out.println();
        System.out.println(deck.pick(0));
    }
}
