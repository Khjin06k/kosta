package a_java.day7.chap6_OOP_1;

// 클래스 정의
public class Student { // 클래스 명과 파일 명은 동일해야 함
    String name; // 이름
    String address; // 주소
    int grade; // 학년
    int num; // 학번

    String info(){
        return String.format("이름 : %s, 주소 : %s, 학년 : %d, 학번 : %d", name, address, grade, num);
    }
}
