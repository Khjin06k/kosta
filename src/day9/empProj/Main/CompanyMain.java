package day9.empProj.Main;

import day9.empProj.global.*;

public class CompanyMain {
    public static void main(String[] args) {
        Company com = new Company();
        Permanent emp1 = new Permanent(1001, "상부상조", 5000000);
        Sales emp2 = new Sales(1002, "자바조", 4000000, 1000000);
        PartTime emp3 = new PartTime(1003, "커피조", 160, 30000);

        com.enter(emp1);
        com.enter(emp2);
        com.enter(emp3);

       /* System.out.println(emp1.info());
        // Sales의 info()는 Permanent의 info()를 호출한 것인데, Permanent의 info()의 getPay()는 Permanent가 아닌 Sales의 getPay가 호출됨
        // 그 이유는 다형성 때문 - 오버라이딩된 getPay()가 자식클래스에도 있기 떄문에 자식의 메서드를 호출자
        System.out.println(emp2.info());
        System.out.println(emp3.info());*/
        com.allEmployeeInfo();
        System.out.println("총 급여 : " + com.getTotalPay());

    }
}
/*
사번 : 1001, 이름 : 상부상조, 급여 : 5000000
사번 : 1002, 이름 : 자바조, 급여 : 5000000
사번 : 1003, 이름 : 커피조, 급여 : 48000000
 */