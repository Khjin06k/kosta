package java.javaFinalExample.test06;

import java.javaFinalExample.test06.biz.VendingMachineBiz;
import java.javaFinalExample.test06.entity.Coffee;
import java.javaFinalExample.test06.entity.Coke;
import java.javaFinalExample.test06.entity.Juice;

import java.util.Scanner;

// TODO :
public class VendingMachineTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VendingMachineBiz vb = new VendingMachineBiz();

        //메뉴 입력받기
        while(true){
            System.out.println("===========================");
            System.out.println("   [음료수 자판기 관리 시스템]   ");
            System.out.println("===========================");
            System.out.println("1. 전체 음료수 및 잔액 보기");
            System.out.println("2. 주스 구입하기 (200원)");
            System.out.println("3. 커피 구입하기 (100원)");
            System.out.println("4. 콜라 구입하기 (50원)");
            System.out.println("5. 구입한 음료수 목록 보기");
            System.out.println("9. 종료");
            System.out.println();

            System.out.print("메뉴 입력 => ");
            int choice = sc.nextInt();
            if(choice == 9) {
                System.out.println("시스템을 종료합니다.");
                break;
            }

            switch(choice){
                case 1:
                    vb.printDrinkList();
                    break;
                case 2:
                    vb.cartDrink(new Juice());
                    break;
                case 3:
                    vb.cartDrink(new Coffee());
                    break;
                case 4:
                    vb.cartDrink(new Coke());
                    break;
                case 5:
                    vb.printCart();
                    break;
                default:
                    System.out.println("메뉴값을 확인 후 다시 입력하세요.");
            }
        }
    }
}
