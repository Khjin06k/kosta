package day9.empProj;

public class Sales extends Permanent{
    int incentive; // 인센티브

    public int getIncentive() {
        return incentive;
    }

    public void setIncentive(int incentive) {
        this.incentive = incentive;
    }

    public Sales(){}
    public Sales(int id, String name, int salary, int incentive){
        super(id, name, salary); // 부모 클래스(Permanent)의 생성자를 가져와서 활용
        this.incentive = incentive;
    }

    @Override
    public int getPay(){ // 급여 반환
        return super.getPay()+getIncentive();
    }
}
