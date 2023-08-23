package day9.empProj.global;

public class Company {
     Employee[] emps = new Employee[100];
     int empCnt;
    public  void enter(Employee emp){ // 자동 업캐스팅 되기 때문에 부모의 자식들은 들어갈 수 있음
        emps[empCnt++] = emp;
    }

    public  void allEmployeeInfo(){
        for(int i = 0; i<empCnt; i++){
            System.out.println(emps[i].info()); // Employee의 Info를 호출하는 것이기 때문에 오버라이딩이 되어 있어야 자식을 가져올 수 있음
        }
    }
    public  int getTotalPay(){
        int total = 0;
        for(int i = 0; i<empCnt; i++){
            total += emps[i].getPay();
            // getPay는 자식들에만 존재 >> Employee를 추상 클래스로 만듦으로서 자식 메서드들을 사용하도록 만듦
        }
        return total;
    }
}
