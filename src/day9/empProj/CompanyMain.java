package day9.empProj;

public class CompanyMain {
    public static void main(String[] args) {
        Permanent emp1 = new Permanent(1001, "상부상조", 5000000);
        Sales emp2 = new Sales(1002, "자바조", 4000000, 1000000);
        PartTime emp3 = new PartTime(1003, "커피조", 160, 30000);
        System.out.println(emp1.info());
        // Sales의 info()는 Permanent의 info()를 호출한 것인데, Permanent의 info()의 getPay()는 Permanent가 아닌 Sales의 getPay가 호출됨
        // 그 이유는 다형성 때문
        System.out.println(emp2.info());
        System.out.println(emp3.info());

    }
}
/*
사번 : 1001, 이름 : 상부상조, 급여 : 5000000
사번 : 1002, 이름 : 자바조, 급여 : 5000000
사번 : 1003, 이름 : 커피조, 급여 : 48000000
 */