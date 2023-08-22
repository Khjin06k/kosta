package day7.chap6_OOP_1;

// 계좌번호 : 10001, 이름 : 고길동, 잔액 : 100000
// 계좌번호 : 10001, 이름 : 고길동, 잔액 : 110000
// 계좌번호 : 10001, 이름 : 고길동, 잔액 : 90000

// 출력이 나오도록 Account 클래스를 작성하세요.
public class OOPTest9 {
    public static void main(String[] args) {

        // 아래 생성자로 인해 생성과 동시에 초기화 진행
        Account acc1 = new Account("10001", "고길동", 100000);
        /*acc1.id = "10001"; // String 타입
        acc1.name = "고길동"; // String 타입
        acc1.balance=100000; // int 타입*/
        System.out.println(acc1.info()); // 계좌, 이름, 잔액 출력 메서드
        acc1.deposit(10000); // 입금
        System.out.println(acc1.info());
        acc1.withdraw(20000); // 출금
        System.out.println(acc1.info());
    }
}

class Account{
    String id;
    String name;
    int balance;

    // 생성자 생성
    Account(String id, String name, int balance){
        // 변수의 이름이 같을 경우 this를 이용
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
