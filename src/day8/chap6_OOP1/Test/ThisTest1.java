package day8.chap6_OOP1.Test;

class Account2{
    String id;
    String name;
    int balance;

    Account2(String id, String name, int balance){
        // 동일한 이름인 경우 this를 작성하여 구분
        // this는 클래스 내 메서드에서만 사용 가능
        // static 메서드에서 사용이 불가능함
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    String info(){
        // 동일한 이름이 없기 때문에 구분할 필요가 없음. 띠라서 this를 사용하지 않아도 됨
        return "계좌번호 : " + this.id + ", 이름 : " + name + ", 잔액 : " + balance;
    }
}
public class ThisTest1 {
    public static void main(String[] args) {
        Account2 acc1 = new Account2("10001", "홍길동", 100000);
    }
}
