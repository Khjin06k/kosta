package day8.chap6_OOP1.EmployeeProj;

public class Company {

    Employee[] emps = new Employee[100];
    int empCnt;

    void enter(Employee emp){
        emps[empCnt++] = emp;
    }

    void setBonus(int id, long pay){
        for(int i = 0; i<empCnt; i++){
            if(emps[i].id == id) emps[i].pay += pay;
        }
    }

    void allEmployeeInfo(){
        for(int i = 0; i<empCnt; i++){
            System.out.println("사번 : " + emps[i].id +  " 이름 : " + emps[i].name + " 부서 : " + emps[i].dep + " 급여 : " + emps[i].pay);
        }
    }

    int getTotalPay(){
        int total = 0;
        for(int i = 0; i<empCnt; i++){
            total += emps[i].pay;
        }
        return total;
    }

    public static void main(String[] args) {
        Company com = new Company();

        Employee emp1 = new Employee(10001, "홍길동", "홍보부", 5000000);
        Employee emp2 = new Employee(10002, "고길동", "총무부", 3500000);
        Employee emp3 = new Employee(10003, "하길동", "개발부", 4000000);

        com.enter(emp1);
        com.enter(emp2);
        com.enter(emp3);

        com.setBonus(10001, 1000000);

        com.allEmployeeInfo();

        System.out.println("총급여액 : " + com.getTotalPay());
    }
}
/*
사번 : 10001, 이름 : 홍길동, 부서 : 홍보부, 급여 : 5000000
사번 : 10002, 이름 : 고길동, 부서 : 총무부, 급여 : 3500000
사번 : 10003, 이름 : 하길동, 부서 : 개발부, 급여 : 4000000
총금여액 : 14500000
 */
