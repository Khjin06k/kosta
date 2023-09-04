package a_java.day11;

abstract class Player{
    int currentPost;
    public Player(){
        currentPost = 0;
    }
    abstract void play(int post);
    abstract void stop();
    void play(){
        play(currentPost);
    }
}

class DPlayer extends Player{
    // 추상클래스를 상속받았기 때문에 추상메서드를 오버라이딩하거나 추상 클래스로 만들어야 함
    @Override
    void play(int post){
        System.out.println("DPlayer play(int post)");
    }
    @Override
    void stop(){
        System.out.println("DPlayer stop");

    }
}

public class AbstractTest1 {
    public static void main(String[] args) {
        // Player player = new Player(); >> 추상 클래스이기 때문에 객체 생성 불가능 - 메서드도 호출 불가능

        DPlayer dPlayer1 = new DPlayer();
        dPlayer1.play();
        dPlayer1.play(10);
        dPlayer1.stop();

        Player player1 = new DPlayer(); // 업캐스팅
        player1.play();
        player1.play(10);
        player1.stop();
    }
}
