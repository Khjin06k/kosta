package BankProj.acc;

import BankProj.exc.BankException;

import java.io.Serializable;

// 등급에 따라 차등으로 입금시마다 이자를 줌 >> 계좌 개설할 때가 아닌 입금시
// 입금액의 퍼센트 : VIP - 0.04%, Gold - 0.03%, Silver - 0.02%, Normal - 0.01%
// 정보 출력시 등급도 포함하여 출력
// 계좌번호 : 10001, 이름 : 홍길동, 잔액, 100000, 등급 : VIP
public class SpecialAccount extends Account implements Serializable {
    String grade = "N"; // 등급 - VIP, Gold, Silver, Normal

    double interest = 0.01;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        //입력을 받고 저장할 때 변경해서 저장해도 됨 >> 이자율까지 같이 결정
        switch (grade) {
            case "V":
            case "v":
                this.grade = "VIP";
                interest = 0.04;
                break;
            case "G":
            case "g":
                this.grade = "Gold";
                interest = 0.03;
                break;
            case "S":
            case "s":
                this.grade = "Silver";
                interest = 0.02;
                break;
            case "N":
            case "n":
                this.grade = "Normal";
                interest = 0.01;
                break;
            //this.grade = grade;
        }
    }

    SpecialAccount() {}

    public SpecialAccount(String id, String name, int balance, String grade){
            super(id, name, balance);
            setGrade(grade);
            //this.grade = grade; // setGrade(grade)를 통해서 입력해줄 수 있음.
            }

    /*public void info(Account sacc){
        String saGrade = ((SpecialAccount)sacc).grade;
        if(saGrade.equals("V")) saGrade = "VIP";
        else if(saGrade.equals("G")) saGrade = "GOLD";
        else if(saGrade.equals("S")) saGrade = "SILVER";
        else saGrade = "NORMAL";
        System.out.println("계좌번호 : " + sacc.id + ", 이름 : " + sacc.name + ", 잔액 : " + sacc.balance + ", 등급 : " + saGrade);
    }*/

    /*public double moneys(Account sacc){
        String sgrade = ((SpecialAccount) sacc).getGrade();
        if(sgrade.equals("V")) return 1.04;
        else if(sgrade.equals("G")) return 1.03;
        else if(sgrade.equals("S")) return 1.02;
        else return 1.01;
    }*/

    @Override
    public void deposit ( int money) throws BankException {
            super.deposit((int) (Math.round(money * (1 + interest))));
    }
    @Override
    public String toString() {
        return super.toString() + ", 등급 : " + grade;
    }
}
