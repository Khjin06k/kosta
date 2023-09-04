package a_java.day10;
class Car{
        String color;
        int door;
        void drive(){
            System.out.println("drive, Brrr~~");
        }
        void stop(){
            System.out.println("stop!!");
        }
}
// 소방차
class FireEngine extends Car{
    void water(){
        System.out.println("Water!!");
    }
}
// 구급차
class Ambulance extends Car{
    void siren(){
        System.out.println("siren~~");
    }
}

public class PolinoTest4 {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();
        fe.water();

        Car car = fe; // 업캐스팅
        // car.water(); 부모 타입의 메서드가 아니기 때문에 사용 불가
        if(car instanceof FireEngine) { // instaceof를 이용해 다운캐스팅이 가능하면 실행하도록 작성
            FireEngine fe2 = (FireEngine) car; // water을 사용하기 위해 다운 캐스팅 진행
            fe2.water(); // 다운 캐스팅으로 다시 water() 사용 가능
        }
    }
}
