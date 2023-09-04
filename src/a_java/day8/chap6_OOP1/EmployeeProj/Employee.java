package a_java.day8.chap6_OOP1.EmployeeProj;

public class Employee {
    int id;
    String name;
    String dep;
    long pay;
    long bonus;
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDep(){
        return dep;
    }
    public long getPay(){
        return pay;
    }
    public long getBonus(){
        return bonus;
    }

    public void setBonus(long bonus){
        this.bonus = bonus;
    }

    Employee(){} // 기본 생성자 생성해주기

    public Employee(int id, String name, String dep, long pay){
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.pay = pay;
    }

    void setBonus(int bonus){
        this.bonus += bonus;
    }

}
