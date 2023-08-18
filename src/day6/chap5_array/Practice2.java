package day6.chap5_array;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // 0을 누르면 종료되도록 설정
        // 주문은 한 번에 한 개만 진행
        Scanner sc = new Scanner(System.in);
        System.out.println("[코스타 카페]");
        System.out.println("1. 아메리카노(1500원)");
        System.out.println("2. 카페라떼 (2500원)");
        System.out.println("3. 카푸치노 (2500원)");
        System.out.println("4. 에스프레소 (2000원)");
        System.out.println("5. 카페모카 (3000원)");
        System.out.println("0. 종료");

        int sel = 0;
        int sum = 0;
        int money = 0;
        int[] coins = {5000, 1000, 500};
        int[] price = {1500, 2500, 2500, 2000, 3000};

        while(true){
            System.out.print("메뉴를 선택하세요 > ");
            sel = sc.nextInt();
            switch(sel){
                case 1 :
                    System.out.println("아메리카노를 주문하셨습니다.");
                    sum += price[sel-1];
                    break;
                case 2:
                    System.out.println("카페라떼를 주문하셨습니다");
                    sum += price[sel-1];
                    break;
                case 3:
                    System.out.println("카푸치노를 주문하셨습니다");
                    sum += price[sel-1];
                    break;
                case 4 :
                    System.out.println("에스프레소를 주문하셨습니다");
                    sum += price[sel-1];
                    break;
                case 5 :
                    System.out.println("카페모카를 주문하셨습니다");
                    sum += price[sel-1];
                    break;
                case 0:
                    System.out.println("주문을 완료하셨습니다. 결제 도와드리겠습니다.");
            }
            if(sel == 0) break;

            System.out.print("돈을 넣으세요 > ");
            money = sc.nextInt();
            System.out.println(money+"원 받았습니다.");

            int[] change = new int[coins.length+1]; // 거스름돈 갯수 저장 배열
            if(money<sum) System.out.println("돈이 부족합니다");
            else{
                int ch = money-sum;
                System.out.println(ch);
                for(int i = 0; i<coins.length; i++){
                    if(ch >= coins[i]){
                        change[i] = ch/coins[i];
                        change[change.length-1] += coins[i]*change[i]; // 총 거스름돈 금액 계산
                        ch = ch%coins[i];
                    }
                    System.out.println(coins[i]+"원 : " + change[i] + "개");
                }
                System.out.println("거스름돈 : " + change[change.length-1]);
            }
        }
    }
}
