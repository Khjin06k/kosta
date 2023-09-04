package a_java.day7.chap6_OOP_1;

class Data{
    int x;

}

public class OOPTest8 {
    static void increment(int x) {
        x += 1;
        System.out.println(x);
    }

    static void increment2(Data d){
        d.x +=1;
        System.out.println(d.x);
    }

    public static void main(String[] args) {
        Data data = new Data();
        data.x = 10;

        increment(data.x); // 11

        System.out.println(data.x); // 10
        increment2(data); // 11
        System.out.println(data.x); // 11

    }
}
