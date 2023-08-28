package BankProj.acc;

import BankProj.exc.BankError;
import BankProj.exc.BankException;

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
    public void setBalance(int balance){
        this.balance = balance;
    }

    Account(){} // 기본 생성자 생성

    // 생성자 생성
    public Account(String id, String name, int balance){
        // 변수의 이름이 같을 경우 this를 이용
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String info(){
       return "계좌번호 : " + id + ", 이름 : " + name + ", 잔액 : " + balance;
    }

    public void deposit(int num) throws BankException{
        //try{
            if(num <=0) throw new BankException("입금 오류", BankError.MINUS);
            balance += num;
        //}catch (Exception e){
        //    System.out.println(e);
        //}
    }

    public void withdraw(int num) throws BankException{
        //try{
            if(balance < num) throw new BankException("축금 오류", BankError.LACK);
            balance -= num;
        //}catch (Exception e){
        //    System.out.println(e);
        //}
    }

    //public abstract double moneys(Account acc);
}
