package day14.chap11_collectionFramework;

class Data<T>{ // 타입을 정하지 않은 것을 T, E, V등 대문자로 작성
    T data; // 미정인 T에 해당하는 data
    void setData(T data){
        this.data = data;
    }
    T getData(){
        return data;
    }
}
public class GenericTest1 {
    public static void main(String[] args) {
        Data<String> d1 = new Data<>(); // Data의 타입을 String으로 지정
        d1.setData("hong");
        String s = d1.getData();
        System.out.println(s);

        Data<Integer> d2 = new Data<>(); // Data 타입을 Integer 타입으로 지정
        d2.setData(200);
        int n = d2.getData();
        System.out.println(n);

        // d2 = d1; //X,  다른 타입으로 생성된 제너릭 객체는 동일한 클래스가 아님 (상속 관계도 아님)


        Data<Person> d3 = new Data<>();
        d3.setData(new Person("james", 30));
        Person p = d3.getData();
        System.out.println(p);

        Data<Person> d4 = new Data<>();

        // d3 = d4; //O,  같은 타입으로 생성된 제너릭 객체는 동일한 클래스
    }
}
