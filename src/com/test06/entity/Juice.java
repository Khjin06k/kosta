package com.test06.entity;

public class Juice extends Drink{
    public final int JUICE_PRICE;
    public Juice(){
        super(200);
        JUICE_PRICE = 200;
    }

    @Override
    public String toString() {
        return "주스 : " + JUICE_PRICE+"원";
    }
}
