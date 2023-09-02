package com.test06.entity;

public class Juice extends Drink{
    final int JUICE_PRICE = 200;
    public Juice(){super();}

    @Override
    public String toString() {
        return "주스 : " + JUICE_PRICE+"원";
    }
}
