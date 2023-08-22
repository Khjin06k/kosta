package day7.chap6_OOP_1;

import java.util.Arrays;

public class OOPTest10 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.makeAccount("10001", "고길동", 100000); // 이를 실행시키기 위한 메서드를 작성하라
        bank.makeAccount("10002", "김길동", 200000);


        // 아래와 같이 출력되도록 메서드를 작성하시오
        // 계좌번호 : 10001, 이름 : 고길동, 잔액 : 100000
        // 계좌번호 : 10002, 이름 : 김길동, 잔액 : 200000
        bank.allAccountInfo();

        // 계좌번호 : 10001, 이름 : 고길동, 잔액 : 100000
        bank.accountInfo("10001");

        // 계좌번호 : 10001, 이름 : 고길동, 잔액 : 110000
        bank.deposit("10001", 10000);
        bank.accountInfo("10001");

        // 계좌번호 : 10001, 이름 : 고길동, 잔액 : 105000
        bank.withdraw("10001", 5000);
        bank.accountInfo("10001");

    }

}

class Account1{
    String id;
    String name;
    int balance;

    Account1(){} // 기본 생성자 생성

    Account1(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    String info(){
        return "계좌번호 : " + id + ", 이름 : " + name + ", 잔액 : " +balance;
    }

    void deposit(int num){
        balance += num;
    }

    void withdraw(int num){
        if(balance >= num) balance -= num;
    }
}

class Bank{
    Account1[] accs = new Account1[100]; // 계좌가 생성된 것이 아닌 공간일 뿐
    int accCnt; // 실제 개설된 계좌의 개수

    // makeAccount 작성하기
    void makeAccount(String id, String name, int balance){
        // 위에서 생성자를 생성하여 생성과 동시에 초기화 진행
        Account1 acc = new Account1(id, name, balance);
       /* acc.id = id;
        acc.name = name;
        acc.balance = balance;*/

        accs[accCnt++] = acc;
    }

    void allAccountInfo(){
        for(int i = 0; i<accCnt; i++){ // 전체 배열을 돌릴 필요 없이 값이 존재하는 곳 까지만 반복을 돌리기 위해 accCnt 만큼만 반복 진행
            System.out.println("계좌번호 : " + accs[i].id + ", 이름 : " + accs[i].name + ", 잔액 : " + accs[i].balance);
        }
    }

    // 과제1
    // id 찾아서 정보 출력
    void accountInfo(String id){
        int idx =-1;
        for(int i = 0; i<accCnt; i++){
            if(accs[i].id.equals(id)){
                idx = i;
                break; // id와 동일한 값을 찾으면 반복문을 돌 필요 없음
            }
        }
        if(idx == -1) System.out.println("계좌번호가 틀립니다.");
        else System.out.println("계좌번호 : " + accs[idx].id + ", 이름 : " + accs[idx].name + ", 잔액 : " + accs[idx].balance);

        /* 강사님 코드
        /* (1)
        Account acc = null;
        for(int i = 0; i<accCnt; i++){
            if(accs[i].id.equals(id){
                acc = accs[i];
                break;
            }
        } deposit과 withdraw에서 사용하는 공통 코드이므로 메서드로 따로 분리*/
        /*
        Account acc = searchAccById(id);
        if(acc == null) System.out.println("계좌번호가 틀립니다");
        else System.out.println(acc.info); // >> Account를 저장한다면 info를 사용할 수 있기 때문에 더 간단한 코드 작성이 가능함.
        * */
    }

    /*
    Account searchAccById(String id){
        for(int i = 0; i<accCnt; i++){
            if(accs[i].id.equals(id){
                reurn accs[i];
            }
        }
        return null;
    }
    * */

    // 과제2
    // 입금 >> id를 찾는것은 accountInfo와 동일하며 balance 값 관련 코드 추가
    void deposit(String id, int num){
        for(int i = 0; i<accCnt; i++){
            if(accs[i].id.equals(id)){
                accs[i].balance += num;
                break;
            }
        }
        /* 강사님 코드
        Account acc = searchAccById(id);
        if(acc == null) {
            System.out.println("계좌번호가 틀립니다");
            return;
        }else acc.deposit(num); >> Account에 있는 메서드 사용
         */
    }

    // 과제3
    // 출금 >> id를 찾는것은 accountInfo와 동일하며 balance 값 관련 코드 추가
    void withdraw(String id, int num){
        for(int i = 0; i<accCnt; i++){
            if(accs[i].id.equals(id)){
                if(accs[i].balance > num) accs[i].balance -= num;
                break;
            }
        }

        /* 강사님 코드
        Account acc = searchAccById(id);
        if(acc == null) {
            System.out.println("계좌번호가 틀립니다");
            return;
        }else acc.withdraw(num); >> Account에 있는 메서드 사용
         */
    }
}