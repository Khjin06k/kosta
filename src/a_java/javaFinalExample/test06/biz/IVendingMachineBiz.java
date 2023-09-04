package a_java.javaFinalExample.test06.biz;

import a_java.javaFinalExample.test06.entity.Drink;

public interface IVendingMachineBiz {
    void cartDrink(Drink drink);
    void printCart();
    void printDrinkList(Drink[] drinkList);
}
