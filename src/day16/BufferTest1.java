package day16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Person{
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
public class BufferTest1 {
    static void write(Person p){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
            fw = new FileWriter("per.txt");
            bw = new BufferedWriter(fw);
            String perStr = p.getName()+","+p.getAge()+","+p.getHeight()+",";
            perStr += p.isMarried()?"Y":"N";
            bw.write(perStr);
            bw.newLine();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(bw != null) bw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    static Person read(){
        Person per = null;
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader("per.txt");
            br = new BufferedReader(fr);
            String perStr = br.readLine();
            String[] perList = perStr.split(",");
            String name = perList[0];
            int age = Integer.parseInt(perList[1]);
            double heigth = Double.parseDouble(perList[2]);
            boolean ismarried = perList[3].charAt(0) =='Y'?true:false;
            per = new Person(name, age, heigth, ismarried);
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(br != null) br.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return per;
    }

    static void write(List<Person> pers){
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter("pers.txt"));
            for(Person p : pers){
                String perStr = p.getName()+","+p.getAge()+","+p.getHeight()+",";
                perStr += p.isMarried()?"Y":"N";
                bw.write(perStr);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(bw != null) bw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    static List<Person> readList(){
        List<Person> pers = new ArrayList<>();
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("pers.txt"));
            String perStr = null;
            while((perStr=br.readLine()) != null){
                String[] perList = perStr.split(",");
                String name = perList[0];
                int age = Integer.parseInt(perList[1]);
                double heigth = Double.parseDouble(perList[2]);
                boolean ismarried = perList[3].charAt(0) =='Y'?true:false;
                pers.add(new Person(name, age, heigth, ismarried));
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(br != null) br.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return pers;
    }
    public static void main(String[] args) {
        /*Person p1 = new Person("hong",30,178.5,false);
        write(p1);
        Person p = read();
        System.out.println(p);*/

       /* List<Person> pers = new ArrayList<>();
        pers.add(new Person("hong", 20, 185, false));
        pers.add(new Person("song", 30, 176, false));
        pers.add(new Person("gong", 40, 165, true));
        write(pers);*/

        List<Person> list = readList();
        for(Person p : list){
            System.out.println(p);
        }

    }

}
