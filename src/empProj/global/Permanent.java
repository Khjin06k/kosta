package empProj.global;

public class Permanent extends Employee{
    int salary; // 급여
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Permanent(){}

    public Permanent(int id, String name, int salary){
        super(id, name); // 부모 클래스의 생성자를 가져와서 활용
        this.salary=salary;
    }

    public int getPay(){ // 급여 반환
        return getSalary();
    }
    @Override
    public String info(){
        return super.info() + ", 급여 : " + getPay();
    }
}
