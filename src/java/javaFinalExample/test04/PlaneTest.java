package java.javaFinalExample.test04;

abstract class Plane{
    String planeName;
    int fuelSize;
    Plane(){}
    Plane(String planeName, int fuelSize){
        this.planeName = planeName;
        this.fuelSize = fuelSize;
    }

    void refule(int fuel){
        fuelSize += fuel;
    }

    void flight(int distance){}
}
class Airplane extends Plane{
    Airplane(){}
    Airplane(String planeName, int fuel){
        super(planeName, fuel);
    }

    @Override
    void flight(int distance) {
        fuelSize -= (distance%10==0?distance/10:distance/10+1)*30;
    }

    @Override
    public String toString() {
        return planeName + " \t" + fuelSize;
    }
}

class Cargoplane extends Plane{
    Cargoplane(){}
    Cargoplane(String planeName, int fuel){
        super(planeName, fuel);
    }

    @Override
    void flight(int distance) {
        fuelSize -= (distance%10==0?distance/10:distance/10+1)*50;
    }

    @Override
    public String toString() {
        return planeName + "\t" + fuelSize;
    }


}
public class PlaneTest {
    public static void main(String[] args) {
        // Airplane과 Cargoplane 객체생성
        Airplane a = new Airplane("L777", 1000);
        Cargoplane c = new Cargoplane("C50", 1000);

        // 생성된 객체의 정보 출력
        System.out.println("Plane\tfuelSize");
        System.out.println("----------------");
        System.out.println(a.toString());
        System.out.println(c.toString());

        // Airplane과 Cargoplane 객체에 100씩 운항
        System.out.println(100 + "운항");
        a.flight(100);
        c.flight(100);

        // 운항후 객체의 변경된 정보 출력
        System.out.println();
        System.out.println("Plane\tfuelSize");
        System.out.println("----------------");
        System.out.println(a.toString());
        System.out.println(c.toString());

        // Airplane과 Cargoplane 객체에 200씩 주유
        System.out.println(200 + "주유");
        a.refule(200);
        c.refule(200);

        // 주유후 객체의 변경된 정보 출력
        System.out.println();
        System.out.println("Plane\tfuelSize");
        System.out.println("----------------");
        System.out.println(a.toString());
        System.out.println(c.toString());
    }
}
