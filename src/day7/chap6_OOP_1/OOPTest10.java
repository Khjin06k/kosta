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
        Account1 acc = new Account1();
        acc.id = id;
        acc.name = name;
        acc.balance = balance;

        accs[accCnt++] = acc;
    }

    void allAccountInfo(){
        for(int i = 0; i<accCnt; i++){ // 전체 배열을 돌릴 필요 없이 값이 존재하는 곳 까지만 반복을 돌리기 위해 accCnt 만큼만 반복 진행
            System.out.println("계좌번호 : " + accs[i].id + ", 이름 : " + accs[i].name + ", 잔액 : " + accs[i].balance);
        }
    }

    void accountInfo(String id){
        int idx =0;
        for(int i = 0; i<accCnt; i++){
            if(accs[i].id.equals(id)){
                idx = i;
                break;
            }
        }
        System.out.println("계좌번호 : " + accs[idx].id + ", 이름 : " + accs[idx].name + ", 잔액 : " + accs[idx].balance);
    }

    // 입금
    void deposit(String id, int num){
        int idx =0;
        for(int i = 0; i<accCnt; i++){
            if(accs[i].id.equals(id)){
                idx = i;
                accs[i].balance += num;
                break;
            }
        }
    }

    // 출금
    void withdraw(String id, int num){
        int idx =0;
        for(int i = 0; i<accCnt; i++){
            if(accs[i].id.equals(id)){
                idx = i;
                if(accs[i].balance > num) accs[i].balance -= num;
                break;
            }
        }
    }
}



