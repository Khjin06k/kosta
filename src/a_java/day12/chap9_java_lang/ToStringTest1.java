package a_java.day12.chap9_java_lang;
class Person{
    String name;
    int age;
    Person  (String name, int age){
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

}
public class ToStringTest1 {
    public static void main(String[] args) {
        Person p1 = new Person("hong", 30);
        String str = "!!!"+p1;
        System.out.println(p1); // println 자체가 문자열로 출력하는 것. 그렇기에 P만 있어도 p.toString을 의미하게 됨
    }
}
