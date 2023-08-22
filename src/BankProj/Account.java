package BankProj;

public class Account {
    String id;
    String name;
    int balance;

    Account(){} // 기본 생성자 생성

    // 생성자 생성
    Account(String id, String name, int balance){
        // 변수의 이름이 같을 경우 this를 이용
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    void info(Account acc){
        System.out.println("계좌번호 : " + acc.id + ", 이름 : " + acc.name + ", 잔액 : " + acc.balance);
    }

    void deposit(int num){
        balance += num;
    }

    void withdraw(int num){
        if(balance >= num) balance -= num;
    }
}
