package a_java.day6.chap5_array;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sel = 0;
        int money = 0;
        int ordCnt = 0;
        int sum = 0;
        int[] order = new int[10];
        int[] coins = {5000, 1000, 500};
        int[] price = {1500, 2500,2500,2000, 3000};
        String[] menu = {"아메리카노", "카페라떼", "카푸치노", "에스프레소", "카페모카"};

        while(true){
            System.out.println("[코스타카페]");
            for(int i = 0; i<menu.length; i++){
                System.out.println(String.format("%d, %s (%d원)", i+1, menu[i], price[i]));
            }
            System.out.println("0, 계산");
            System.out.print("선택 > ");
            sel = sc.nextInt();
            if(sel !=0){
                sum += price[sel-1];
                order[ordCnt++] = sel;
            }
            else{
                // 주문내역 보여주기
                for(int i = 0; i<ordCnt; i++){
                    if(i == ordCnt-1) System.out.println(order[i]+ ":" + menu[order[i]-1] );
                    else System.out.print(order[i]+ ":" + menu[order[i]-1] +", ");
                }
                // 돈 입력받기
                System.out.print("돈 내기 > ");
                money = sc.nextInt();

                int[] change = new int[coins.length+1]; // 거스름돈 갯수 저장 배열
                // 돈이 부족하면 돈이 부족합니다 출력
                if(sum > money) System.out.println("돈이 부족합니다.");
                // 돈이 부족하지 않으면 잔돈 내어주기
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
                break;
            }

        }
    }
}
