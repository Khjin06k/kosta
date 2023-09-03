package java.day9.Test;
class Person{
    int age;
    String name;
    Person (){};
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    String info(){
        return "이름 : " + name + ", 나이 : " + age;
    }
}
class Student extends Person{
    // 부모 생성자가 자식을 자동으로 호출
    // 부모에 기본생성자가 없으면(다른 생성자를 추가하면 컴파일러가 자동 기본 생성자를 생성해주지 않기 떄문) 자식에 에러가 발생

    String major;
    int grade;
    Student(){}

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student(String name, int age, String major, int grade){
        super(name, age); // 부모 클래스의 생성자 Person(String name, int age)를 가져와서 사용
        this.major = major;
        this.grade = grade;
    }

    @Override // 오버라이딩 - 부모의 메서드를 재정의
    String info(){
        // super을 사용하여 내 것이 아닌 부모것을 호출하겠다는 의미
        // 부모것을 살릴 필요가 없는 경우에는 그냥 갈아엎으면 됨
        return super.info()+", 전공 : " + major + ", 학년 : " + grade;
    }
}
public class InheritTest1 {
    public static void main(String[] args) {
        // 상속을 받기 때문에 자식 객체를 통해 부모 객체의 변수들과 메서드를 가져와 사용할 수 있음

        // Student student = new Student();
        // student.name = "홍길동";
        // student.age = 24;
        // student.major = "산업공학";
        // student.grade = 2;
        // System.out.println(student.info());

        Person per1 = new Person();
        per1.name = "내로남불";
        per1.age = 30;
        //per1.major = "얌채과"; >> 자식 클래스는 부모 클래스를 알지만 부모는 자식을 모르기 때문에 자식 클래스의 것들을 가져다 사용이 불가능함
        // per1.grade = 3;
        System.out.println(per1.info());

        Student student = new Student("홍길동", 24);
        System.out.println(student.info());

        // 부모의 info 기능이 만족스럽지 않을 때 메서드를 변경할 수 있음 (오버라이딩)

        Student student2 = new Student("고길동", 25, "산업공학", 3);
        System.out.println(student2.info());

        Student student3 = new Student("돈많은", 40, "금융", 3);
    }
}
