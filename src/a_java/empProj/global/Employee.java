package a_java.empProj.global;

public abstract class Employee {
    int id; // 사원 번호
    String name; // 이름
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract int getPay(); // 완성시키지 않은 메서드 >> 추상 메서드 >> 추상 메서드를 가진 클래스는 추상클래스
    public Employee(){}
    public Employee(int id, String name){ // 생성자 생성으로 기본 생성자는 만들어야 함
        this.id= id;
        this.name = name;
    }

    public String info(){
        return "사번 : " + id + ",\t이름 : " + name;
    }
}
