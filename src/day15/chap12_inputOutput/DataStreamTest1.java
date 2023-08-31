package day15.chap12_inputOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Person{
    String name;
    int age;
    double height;
    boolean married;
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
public class DataStreamTest1 {
    static void write(Person p){
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try{
            fos = new FileOutputStream("person.bin");
            dos = new DataOutputStream(fos);
            dos.writeUTF(p.name);
            dos.writeInt(p.age);
            dos.writeDouble(p.height);
            dos.writeBoolean(p.married);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(dos != null) dos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    static Person read(){
        FileInputStream fis = null;
        DataInputStream dis = null;
        Person p = null;
        try{
            fis = new FileInputStream("person.bin");
            dis = new DataInputStream(fis);
            String name = dis.readUTF(); // 항상 write한 정보 순서 그대로 가져올 수 있음
            int age = dis.readInt();
            double height = dis.readDouble();
            boolean married = dis.readBoolean();
            p = new Person(name, age, height, married);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(dis != null) dis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return p;
    }

    static void write(List<Person> pers){
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try{
            fos = new FileOutputStream("person.bin");
            dos = new DataOutputStream(fos);

            // 몇명인지를 먼저 저장
            dos.writeInt(pers.size()); // 인원수 저장

            for(Person p : pers){ // 반복문을 돌면서 모든 Person을 저장
                dos.writeUTF(p.name);
                dos.writeInt(p.age);
                dos.writeDouble(p.height);
                dos.writeBoolean(p.married);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(dos != null) dos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    static List<Person> readList(){
        List<Person> pers = new ArrayList<>(); // 읽어올 때에는 몇명인지 모르기 때문에 저장할 때 개수를 저장하는 것이 좋음.
        FileInputStream fis = null;
        DataInputStream dis = null;
        Person p = null;
        try{
            fis = new FileInputStream("person.bin");
            dis = new DataInputStream(fis);

            int length = dis.readInt(); // 정보 저장 시 맨 앞에 저장한 인원수를 먼저 가져온 후 그만큼 반복을 진행
            for(int i = 0; i<length; i++){
                String name = dis.readUTF(); // 항상 write한 정보 순서 그대로 가져올 수 있음
                int age = dis.readInt();
                double height = dis.readDouble();
                boolean married = dis.readBoolean();
                pers.add(new Person(name, age, height, married));
            }


        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(dis != null) dis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return pers;
    }

    public static void main(String[] args) {
        Person p1 = new Person("hong", 35, 165, false);
        //write(p1);

        //Person p2 = read();
        //System.out.println(p2);

        List<Person> pers = new ArrayList<>();
        pers.add(new Person("hong", 20, 185, false));
        pers.add(new Person("song", 30, 176, false));
        pers.add(new Person("gong", 40, 165, true));

        write(pers);
        List<Person> p3 = readList();
        for(Person p : p3){
            System.out.println(p);
        }
        // System.out.println(p3);

    }
}
