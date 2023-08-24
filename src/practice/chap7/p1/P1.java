package practice.chap7.p1;

// 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다.
// 섯 다카드 20장을 담는 SutdaCard배열을 초기화하시오.
// 단, 섯다카드는 1부터 10까지의 숫자 가 적힌 카드가 한 쌍씩 있고,
// 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이 어야 한다.
// 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.

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
}
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

    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}



public class P1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
    }
}