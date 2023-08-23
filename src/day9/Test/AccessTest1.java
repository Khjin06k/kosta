package day9.Test;


public class AccessTest1 {
    public static void main(String[] args) {
        day9.Package.Number n1 = new day9.Package.Number();
        // private
        // n1.pnum = 100; // 다른 클래스의 private 멤버는 접근 불가
        // n1.pmethod();

        // defualt
        //1.dnum = 100; // 같은 패키지에 있는 클래스 객체의 default 멤버 접근 가능
        n1.getDnum(); // dnum의 값을 읽어온다
        n1.setDnum(100); // dnum의 값을 100으로 변경
        n1.dmethod();

        // public
        n1.punum = 100; // 다른 클래스의 public 멤버는 어디서든 접근 가능
        n1.pumethod();

        // n1.prum = 100; // 자식도 아니고 같은 퍂키지도 아니면 protected는 접근 불가
    }
}
