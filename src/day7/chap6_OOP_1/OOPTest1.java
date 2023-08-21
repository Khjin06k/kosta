package day7.chap6_OOP_1;

/*
하나의 자바 파일 안에 클래스를 여러개 생성할 수는 있지만 대부분 클래스를 구분함
// Student 클래스 정의
class Student{ // 클래스 명은 대문자로 시작
    String name; // 이름
    String address; // 주소
    int grade; // 학년
    int num; // 학번
}*/
public class OOPTest1 {
    public static void main(String[] args) {// main이 들어가 있는 클래스는 반드시 public이 있어야 하며, 하나의 자바 파일에는 public 파일이 하나만 있어야 함
        int n;
        Student stu1 = new Student(); // stu1도 배열과 같이 객체가 아닌 주소값, new Student를 통해 객체를 생성하였고 해당 객체의 주소값이 stu1이 됨
        Student stu2; // 객체가 생성된 것이 아닌 Student 객체를 담을 주소값만 생성된 것

        // 레퍼런스(stu1)를 통해 객체에 값을 넣을 수 있음
        stu1.name = "홍길동";
        stu1.address = "서울시 금천구";
        stu1.grade = 4;
        stu1.num = 10001;

        System.out.println("이름 : " + stu1.name);
        System.out.println("주소 : " + stu1.address);
        System.out.println("학년 : " + stu1.grade);
        System.out.println("학번 : " + stu1.num);

        // 클래스 내에서 선언된 기능으로 출력도 가능함
        System.out.println(stu1.info());
    }
}
