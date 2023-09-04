package a_java.day16.ObjectStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Person  implements Serializable {
    String name;
    int age;
    double height;
    boolean married;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    Person(String name, int age, double height, boolean married){
        this.age = age;
        this.name = name;
        this.height = height;
        this.married = married;
    }

    @Override
    public String toString() {
        return "Person{" +
                "이름 = " + name + '\'' +
                ", 나이 = " + age +
                ", 키 = " + height +
                ", 결혼 = " + (married?"Y":"N") +
                '}';
    }
}

public class ObjectStreamTest{
    static void write(List<Person> pers){
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream("pers.dat"));
            oos.writeObject(pers);
            /*oos.writeInt(pers.size());
            for(Person p : pers){
                oos.writeObject(p);
            }*/
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(oos != null) oos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    static List<Person> read(){
        List<Person> pers = new ArrayList<>();
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream(new FileInputStream("pers.dat"));
            pers = (List<Person>)(ois.readObject());
            /*int count = ois.readInt(); // 데이터 개수
            for(int i = 0; i<count; i++){
                Person p = (Person)(ois.readObject());
                pers.add(p);
            }*/
        }catch(ClassNotFoundException ce){
            ce.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(ois != null) ois.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return pers;
    }
    public static void main(String[] args) {
        List<Person> pers = new ArrayList<>();
        pers.add(new Person("hong", 20, 185, false));
        pers.add(new Person("song", 30, 176, false));
        pers.add(new Person("gong", 40, 165, true));
        write(pers);
        List<Person> psers = read();
        for(Person p : pers){
            System.out.println(p);
        }

    }
}
