package a_java.empProj.global;

public class Sales extends Permanent implements BusinessTrip{
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

    // 인터페이스에 있는 메서드 오버라이딩 진행 후 하루당 300,000원을 인센티브로 지급해야 함
    @Override
    public void reBusinessTrip(int n) {
        setIncentive(getIncentive()+300000*n); // 인센티브에 출장 비용을 더해 저장
        /*
        강사님 코드
        incentive += day*300000;
         */
    }
}
