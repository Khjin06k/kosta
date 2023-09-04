package a_java.javaFinalExample.test06.entity;

public class Coke extends Drink{
    final int COKE_PRICE;
    public Coke(){
        super(50);
        COKE_PRICE=50;
    }

    @Override
    public String toString() {
        return "콜라 : "+COKE_PRICE+"원";
    }
}
