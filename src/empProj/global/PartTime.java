package empProj.global;

public class PartTime extends Employee implements BusinessTrip{
    int time; // 근무 시간
    int payPerTime; // 시간 당 급여
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPayPerTime() {
        return payPerTime;
    }

    public void setPayPerTime(int payPerTime) {
        this.payPerTime = payPerTime;
    }

    public PartTime(){}
    public PartTime(int id, String name, int time, int payPerTime){
        super(id, name); // 부모 클래스의 생성자를 가져와서 활용
        this.time = time;
        this.payPerTime = payPerTime;
    }

    public int getPay(){ // 급여 반환
        return getTime()*getPayPerTime();
    }

    @Override
    public String info(){
        return super.info() + ", 급여 : " + getPay();
    }

    // 인터페이스에 있는 메서드 오버라이딩 진행 후 출장시간(24시간)*payPerTime을 인센티브로 지급해야 함
    @Override
    public void reBusinessTrip(int n) {
        setTime(getTime()+(n*24)); // 일한 시간을 가져와 다시 세팅 진행
    }
}
