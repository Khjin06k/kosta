package practice.chap5;

public class p7 {
    public static void main(String[] args) {
        // 문제 5-6에 동전의 개수를 추가한 프로그램이다.
        // 커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다.
        // 보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름 돈이 부족합니다.’라고 출력하고 종료한다.
        // 지불할 돈이 충분히 있으면, 거스름돈을 지불 한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다.

        if(args.length!=1) {
            System.out.println("USAGE: java Exercise5_7 3120");
            System.exit(0);
        }

        // 문자열을 숫자로 변환
        // 입력한 값이 숫자가 아닐 경우 예외가 발생
        // args를 사용하기 때문에 Configuration의 argument에 값을 설정해야 결과 출력이 가능함
        int money = Integer.parseInt(args[0]);
        System.out.println("money="+money);

        int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
        int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수

        for(int i=0;i<coinUnit.length;i++) {
            int coinNum = 0;

//          1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
            coinNum = money / coinUnit[i];

//          2. 배열 coin에서 coinNum만큼의 동전을 뺀다.(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
            // 가지고 있는 동전의 갯수를 전부 이용해야 하는 경우
            if(coinNum>=coin[i]){
                coinNum = coin[i];
                coin[i] = 0;
            }
            // 가지고 있는 동전의 갯수를 전부 이용하지 않아도 되는 경우
            else coin[i] = coin[i]-coinNum;

//          3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
            money = money - coinNum*coinUnit[i];

            /* 삼항ㅡ연산자를 이용하여 풀이하는 경우
            coinNum = money/coinUnit[i]<coin[i]?money/coinUnit[i]:coin[i];
            System.out.println(coinUnit[i]+"원: "+coinNum);
            coin[i] -= coinNum;
            money -= coinUnit[i]*coinNum;*/

            System.out.println(coinUnit[i]+"원: "+coinNum);
        }

        if(money > 0) {
                System.out.println("거스름돈이 부족합니다."); System.exit(0); // 프로그램을 종료한다.
        }

        System.out.println("=남은 동전의 개수 =");
        for(int i=0;i<coinUnit.length;i++) {
            System.out.println(coinUnit[i]+"원:"+coin[i]);
        }
    }
}
