package com.test06.entity;

public class Coke extends Drink{
    final int COKE_PRICE = 50;
    public Coke(){super();}

    @Override
    public String toString() {
        return "콜라 : "+COKE_PRICE+"원";
    }
}
