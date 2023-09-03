package com.test05;

import java.util.HashMap;

class Employee{
    String name;
    int number;
    String department;
    int salary;
    Employee(){}

    public Employee(String name, int number, String department, int salary) {
        this.name = name;
        this.number = number;
        this.department = department;
        this.salary = salary;
    }

    double tax(){
        return tax();
    }
}
interface Bonus{
    void incentive(int pay);
}
class Secretary extends Employee implements Bonus{
    public Secretary() {}

    public Secretary(String name, int number, String department, int salary) {
        super(name, number, department, salary);
    }

    double tax(){
        return (double)salary/10;
    }

    @Override
    public void incentive(int pay) {
        salary += pay*0.8;
    }

    @Override
    public String toString() {
        return String.format("%s \t %s \t %d", name, department, salary);
    }
}
class Sales extends Employee implements Bonus{
    public Sales() {}

    public Sales(String name, int number, String department, int salary) {
        super(name, number, department, salary);
    }

    double tax(){
        return (double)salary*1.3;
    }

    @Override
    public String toString() {
        return String.format("%s \t %s \t %d", name, department, salary);
    }

    @Override
    public void incentive(int pay) {
        salary += pay*1.2;
    }
}
public class Company {
    public static void main(String[] args) {
        HashMap<Integer, Employee> map = new HashMap<>();

        // 1번의 데이터를 기반으로 객체를 생성하여 HashMap에 저장한다.
        // HashMap에 저장시 키 값은 각 객체의 Number로 한다.
        map.put(1, new Secretary("홍길동", 1, "Secretary", 800));
        map.put(2, new Sales("이순신", 2, "Sales", 1200));

        // 모든 객체의 기본 정보를 출력한다. ( for문 이용 , keySet() 이용 )
        System.out.println("name \t department \t salary");
        for(Employee e : map.values()){
            System.out.println(e.toString());
        }

        // 모든 객체의 인센티브 100씩 지급한다.
        System.out.println();
        System.out.println("인센티브 100 지급");
        for(Employee e : map.values()){
            if(e instanceof Secretary){
                Secretary s = (Secretary) e;
                s.incentive(100);
            }
            else if(e instanceof Sales){
                Sales s = (Sales) e;
                s.incentive(100);
            }
        }

        // 모든 객체의 정보와 세금을 출력한다. ( for문 이용 )
        System.out.println();
        System.out.println("name \t department \t salary \t tax");
        for(Employee e : map.values()){
            System.out.println(e.toString() +"\t"+ e.tax());
        }
        for(int i : map.keySet()){
            System.out.println(map.get(i).tax());
        }
    }
}
