package java.day10;

class TempClass{
    final int x;// = 20;
    static final int sx = 100; // 모든 객체에서 값을 고정적으로 공통으로 가지고 있고자 한다면 static을 붙이면 됨
    TempClass(int x){
        // x = 30; 변경할 수 없기 때문에 초기화가 이미 되어있다면 값을 초기화 할 수 없음
        // 만약  final int x;로 선언만 했다면 초기화가 가능하며, 이번에 초기화가 된 이후 재초기화가 불가능함
        // 두번째처럼 생성자에서 초기화를 하게 되면 객체를 생성을 할 때마다 변수의 값이 달라지기 때문에 객체마다 값을 다르게 하고 싶다면 생성자에서 초기화를 진행해야 함
        this.x = x;
        // sx = x; // static final은 생성자에서 초기화 할 수 없음
    }

    /*void method(int x){ // x가 final이기 때문에 변경 불가능 >> 생성자에서 이미 초기화를 해서
        this.x = x;
    }*/
}
public class FinalTest1 {
    public static void main(String[] args) {
        final int n;
        n = 10;
        //n = 20; >> final이 붙은 변수를 한 번만 초기화 가능
        System.out.println(n);
        new TempClass(20);
        new TempClass(30);
    }
}
