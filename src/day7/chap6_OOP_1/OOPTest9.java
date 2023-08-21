package day7.chap6_OOP_1;

// 계좌번호 : 10001, 이름 : 고길동, 잔액 : 100000
// 계좌번호 : 10001, 이름 : 고길동, 잔액 : 110000
// 출력이 나오도록 Account 클래스를 작성하세요.
public class OOPTest9 {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.id = "10001";
        acc1.name = "고길동";
        acc1.balance=100000;
        System.out.println(acc1.info());
        acc1.deposit(10000);
        System.out.println(acc1.info());
    }
}

class Account{
    String id;
    String name;
    int balance;

    String info(){
        return "계좌번호 : " + id + ", 이름 : " + name + ", 잔액 : " +balance;
    }

    void deposit(int num){
        balance += num;
    }
}
