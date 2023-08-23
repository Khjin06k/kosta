package BankProj.acc;

public class Account {
    String id;
    String name;
    int balance;

    // 다른 패키지에 있는 Bank에서 변수들을 불러오기 위해 게터 이용
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }

    Account(){} // 기본 생성자 생성

    // 생성자 생성
    public Account(String id, String name, int balance){
        // 변수의 이름이 같을 경우 this를 이용
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void info(Account acc){
        System.out.println("계좌번호 : " + acc.id + ", 이름 : " + acc.name + ", 잔액 : " + acc.balance);
    }

    public void deposit(int num){
        balance += num;
    }

    public void withdraw(int num){
        if(balance >= num) balance -= num;
    }
}
