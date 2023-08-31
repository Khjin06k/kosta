package practice.chap11.p6;
// [11-6] 다음의 코드는 성적평균의 범위별로 학생 수를 세기 위한 것이다.
// TreeSet이 학생들의 평균을 기준으로 정렬하도록 compare(Object o1, Object o2)와
// 평균점수의 범위를 주면 해당 범위에 속한 학생의 수를 반환하는 getGroupCount()를 완성하라.
//[Hint] TreeSet의 subSet(Object from, Object to)를 사용하라.

import java.util.*;

class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal() {
        return kor+eng+math;
    }
    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }
    public String toString() {
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getTotal()
                +","+getAverage()
                ;
    }
    public int compareTo(Object o) {
        if(o instanceof Student) {
            Student tmp = (Student)o;
            return name.compareTo(tmp.name);
        } else {
            return -1;
        }
    }
}
public class P6 {
    static int getGroupCount(TreeSet tset, int from, int to) {
        // TODO : 풀어야 할 메서드 >> 캐스팅 관련 에러 발생 >> 문제 해결 필요 및 subSet 이용 방법 확인 필요
        Student s1 = new Student("", from, from, from, from, from);
        Student s2 = new Student("", to, to, to, to, to);
        return tset.subSet(s1, s2).size();
    }
    public static void main(String[] args) {
        /*TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() { // 제너릭 명시 필요
            public int compare(Student o1, Student o2) {
                if(o1.getAverage() - o2.getAverage()>0) return 1; // 다운캐스팅 없이 매개변수의 타입을 바로 변경 가능
                else if(o1.getAverage() - o2.getAverage()<0) return -1;
                else return 0;
            }
        });*/
        TreeSet set = new TreeSet(new Comparator() {
            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;
                if(s1.getAverage() - s2.getAverage()>0) return 1;
                else if(s1.getAverage() - s2.getAverage()<0) return -1;
                else return 0;
            }
        });

        set.add(new Student("홍길동",1,1,100,100,100));
        set.add(new Student("남궁성",1,2,90,70,80));
        set.add(new Student("김자바",1,3,80,80,90));
        set.add(new Student("이자바",1,4,70,90,70));
        set.add(new Student("안자바",1,5,60,100,80));

        Iterator it = set.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        System.out.println("[60~69] :"+getGroupCount(set,60,70));
        System.out.println("[70~79] :"+getGroupCount(set,70,80));
        System.out.println("[80~89] :"+getGroupCount(set,80,90));
        System.out.println("[90~100] :"+getGroupCount(set,90,101));
    }
}


/*




 */
