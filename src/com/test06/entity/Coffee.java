package com.test06.entity;

public class Coffee extends Drink{
    final int COFFEE_PRICE=100;

    public Coffee() {
        super();
    }

    @Override
    public String toString() {
        return "커피 : "+COFFEE_PRICE+"원";
    }
}
