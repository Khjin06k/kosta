package day12.chap9_java_lang;
class Person1{
    String name;
    int age;
    Person1  (String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "이름 : " + name + ", 나이 : " + age;
    }

/*    public String info(){
        return "이름 : " + name + ", 나이 : " + age;
    }*/

    @Override
    public boolean equals(Object obj) { // 논리적으로 안이 동일한지 비교해서 사용할 때 사용
        if(obj instanceof Person == false) return false;
        Person p = (Person) obj; // Person 타입이기에 다운 캐스팅 진행
        return name.equals(p.name) && age ==p.age;
    }
}
public class EqualsTest1 {
    public static void main(String[] args) {
        Person1 p1 = new Person1("hong", 30);
        Person1 p2 = new Person1("hong", 30);
        System.out.println(p1.equals(p2)); // 오버라이딩 했기 때문에 이름과 나이가 동일하면 true
        System.out.println(p1 == p2); // 레퍼런스 비교, 주소값이 동일하면 true
    }
}
