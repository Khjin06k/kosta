package day8.chap6_OOP1.EmployeeProj;

public class Employee {
    int id;
    String name;
    String dep;
    long pay;
    long bonus;

    Employee(){} // 기본 생성자 생성해주기

    Employee(int id, String name, String dep, long pay){
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.pay = pay;
    }

    void setBonus(int bonus){
        this.bonus += bonus;
    }

}
