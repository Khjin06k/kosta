package day11;
interface Fightable{
    void fight();
}
abstract class Unit{
    public void move(){}
}
interface Helping{
    void help();
}
class Fighter extends Unit implements Fightable{
    @Override
    public void fight() {
        System.out.println("Fighter fight");
    }
    @Override
    public void move(){
        System.out.println("Fighter move");
    }
}

class Helper extends Unit implements Helping{
    @Override
    public void help() {
        System.out.println("Helper help");
    }
    @Override
    public void move(){
        System.out.println("Helper move");
    }
}

class Comber extends Unit implements Fightable, Helping{
    @Override
    public void fight() {
        System.out.println("Comber fight");
    }

    @Override
    public void move() {
        System.out.println("Comber move");
    }

    @Override
    public void help() {
        System.out.println("Comber help");
    }
}
public class InterfaceTest1 {
    public static void main(String[] args) {
        Fightable fight = new Fighter(); // 업캐스팅 한 것과 똑같음
        fight.fight();
        // fighter.move(); // Fightable 타입이기 때문에 레퍼런스 타입에 없는 메서드 호출은 불가능

        // Fighter는 아래와 같이 올 수 있음 >> 자신과 부모 타입에 올 수 있음
        Fighter fighter = new Fighter();
        Fightable fighter1 = new Fighter();
        Unit fighter2 = new Fighter();
        Object fighter3 = new Fighter();

        // Helper는 아래와 같이 올 수 있음
        Helper helper = new Helper();
        Unit helper1 = new Helper();
        helper1.move(); // 부모클래스에 있는 메서드만 호출이 가능
        Helping helper2 = new Helper();
        helper2.help();

        // Combo는 아래와 같이 올 수 있음
        Comber combo = new Comber();
        Fightable combo1 = new Comber();
        combo1.fight();;
        Helping combo2 = new Comber();
        combo2.help();;
        Unit combo3 = new Comber();
        combo3.move();;
        Object combo4 = new Comber();

        System.out.println("=======method1======");
        method1(fighter);
        method1(combo);
        // method1(helper); // 에러 발생
        System.out.println("=======method2======");
        //method2(fight); // 에러 발생
        method2(combo);
        method2(helper);
        System.out.println("=======method3======");
        method3(fighter);
        method3(combo);
        method3(helper);
    }

    static void method1(Fightable unit){ // helper에 에러가 나게 하기 위해 Fightable 타입(fightdhk combo만 들어갈 수 있도록)
        unit.fight(); // 들어오는 unit에 따라서 호출되는 것이 다름 (combo라면 comber의 fight를 호출하고 fingter이라면 fighter의 fight를 호출)
    }
    static void method2(Helping unit){ // fight에 에러가 나게 하기 위해 Helping 타입(helper와 combo만 들어갈 수 있도록)
        unit.help(); // combo라면 comber의 help가 호출되고, helper라면 Help의 hekper를 호출
    }
    static void method3(Unit unit){ // 모두 다 들어가게 하기 위해 공통 클래스로 Unit 타입
        unit.move();
    }
}
