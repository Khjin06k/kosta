package java.javaFinalExample.test06.entity;

public class Coffee extends Drink{
    public final int COFFEE_PRICE;

    public Coffee() {
        super(100);
        COFFEE_PRICE = 100;
    }

    @Override
    public String toString() {
        return "커피 : "+COFFEE_PRICE+"원";
    }
}
