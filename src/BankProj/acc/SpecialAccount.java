package BankProj.acc;

// 등급에 따라 차등으로 입금시마다 이자를 줌 >> 계좌 개설할 때가 아닌 입금시
// 입금액의 퍼센트 : VIP - 0.04%, Gold - 0.03%, Silver - 0.02%, Normal - 0.01%
// 정보 출력시 등급도 포함하여 출력
// 계좌번호 : 10001, 이름 : 홍길동, 잔액, 100000, 등급 : VIP
public class SpecialAccount extends Account{
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    String grade; // 등급 - VIP, Gold, Silver, Normal
    public SpecialAccount(){}
    public SpecialAccount(String id, String name, int money, String grade){
        super(id, name, money);
        this.grade = grade;
    }

    public void info(Account sacc){
        System.out.println("계좌번호 : " + sacc.id + ", 이름 : " + sacc.name + ", 잔액 : " + sacc.balance + ", 등급 : " + ((SpecialAccount)sacc).grade);
    }

}
