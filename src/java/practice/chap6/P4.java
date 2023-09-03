package java.practice.chap6;

// 문제6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드 getTotal()과 getAverage()를 추가하시오.
public class P4 {
    public static void main(String[] args) {
        Student s = new Student(); s.name = "홍길동";
        s.ban = 1;
        s.no =1;
        s.kor = 100; s.eng = 60; s.math = 76;
        System.out.println("이름:"+s.name); System.out.println("총점:"+s.getTotal()); System.out.println("평균:"+s.getAverage());
    }
}

class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal(){
        return kor+eng+math;
    }

    float getAverage(){
        // 소수점 둘째자리에서 반올림 >> Math.round를 이용
        return (float) (Math.round((getTotal()/3.0)*10)/10.0);

        // 강사님 풀이
        /*
         float avg = (float)getTotal()/3;
         // 75.545 >> 76
         // 75.545*10 >> 755.45 >> 7555(round)/10.0 >> 75.5
         return Math.round(avg*10)/10.0f;
         */
    }
}
