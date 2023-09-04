package a_java.javaFinalExample.test06.biz;

import a_java.javaFinalExample.test06.entity.Coffee;
import a_java.javaFinalExample.test06.entity.Coke;
import a_java.javaFinalExample.test06.entity.Drink;
import a_java.javaFinalExample.test06.entity.Juice;

import java.util.Arrays;

public class VendingMachineBiz {
    int balance =1000;
    Drink[] cartList = new Drink[3];
    int count = 0;

    public void cartDrink(Drink drink){ // 음료수 구매 로직
        if(cartList.length == count){
            Drink[] list = Arrays.copyOf(cartList, cartList.length*3);
            cartList = list;
        }
        cartList[count] = drink;
        count++;
        if(drink instanceof Juice){
            if(balance - 200 <0){
                System.out.println("잔액이 부족하여 주스 구매가 불가능합니다.");
                return;
            }
            System.out.print("주스를 구매하셨습니다. ");
            drink.setPrice(drink.getPrice()+200);
            balance -= 200;
        }else if(drink instanceof Coffee){
            if(balance - 100 <0){
                System.out.println("잔액이 부족하여 커피 구매가 불가능합니다.");
                return;
            }
            System.out.print("커피를 구매하셨습니다. ");
            drink.setPrice(drink.getPrice()+100);
            balance -= 100;
        }else{
            if(balance - 50 <0){
                System.out.println("잔액이 부족하여 콜라 구매가 불가능합니다.");
                return;
            }
            System.out.print("콜라를 구매하셨습니다. ");
            drink.setPrice(drink.getPrice()+50);
            balance -= 50;
        }
        System.out.println("현재 잔액 : " + balance+"원");
    }

    public void printCart(){
        int count1=0, count2=0, count3 = 0;

        for(Drink d : cartList){
            if(d instanceof Coffee){
                count1++;
            }else if(d instanceof Juice){
                count2++;
            }else if(d instanceof Coke){
                count3++;
            }
        }

        System.out.println("=====음료수 구입 목록=====");
        System.out.println(" 쥬스 " + count2+ "개");
        System.out.println(" 커피 " + count1 + "개");
        System.out.println(" 콜라 " + count3 + "개");
        System.out.println("사용 금액 : " + (1000-balance));
        System.out.println("남은 금액 : " + balance);
    }
    public void printDrinkList(){
        System.out.println("==========");
        System.out.println("음료수명  가격");
        System.out.println("커피  100원");
        System.out.println("콜라   50원");
        System.out.println("주스  200원");
        System.out.println("----------");
        System.out.println("잔액 : " + balance);
    }
}
