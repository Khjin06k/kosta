package empProj.global;

public class Company {
     Employee[] emps = new Employee[100];
     int empCnt;
    public  void enter(Employee emp){ // 자동 업캐스팅 되기 때문에 부모의 자식들은 들어갈 수 있음
        emps[empCnt++] = emp;
    }

    // 전체 사원 조회
    public  void allEmployeeInfo(){
        for(int i = 0; i<empCnt; i++){
            System.out.println(emps[i].info()); // Employee의 Info를 호출하는 것이기 때문에 오버라이딩이 되어 있어야 자식을 가져올 수 있음
        }
    }
    // 총 급여
    public  int getTotalPay(){
        int total = 0;
        for(int i = 0; i<empCnt; i++){
            total += emps[i].getPay();
            // getPay는 자식들에만 존재 >> Employee를 추상 클래스로 만듦으로서 자식 메서드들을 사용하도록 만듦
        }
        return total;
    }
    // 출장을 넣어주는 기능 >> 출장을 다녀오면 인센티브 >> salary는 출장 불가, PartTime/Sales만 출장이 가능하고, 인센티브 금액은 다름
    public void regBusinessTrip(BusinessTrip emp, int day){
        emp.reBusinessTrip(day);
    }
}
