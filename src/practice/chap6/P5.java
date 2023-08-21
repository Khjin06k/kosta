package practice.chap6;

public class P5 {
    public static void main(String[] args) {
        // 생성자를 배운 경우
        Student1 s = new Student1("홍길동",1,1,100,60,76);

        /*
        생성자 아직 배우지 않은 경우
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        */
        System.out.println(s.info());
    }
}

class Student1{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    // 생성자를 배운 경우 >> 생성자를 배우지 않은 경우 main 메서드에서 하나씩 지정
    public Student1(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info(){
        return String.format("%s, %d, %d, %d, %d, %d", name, ban, no, kor, eng, math);
    }
}
