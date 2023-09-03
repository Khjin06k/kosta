package java.day15.chap11_collectionFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {
    public static void main(String[] args) {
        Properties prop1 = new Properties();
        Properties prop2 = new Properties();
        try{
            prop1.load(new FileInputStream("profile.properties"));
            prop2.loadFromXML(new FileInputStream("profile.xml"));
            System.out.println(prop1);
            System.out.println(prop2);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
