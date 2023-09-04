package a_java.day15.chap11_collectionFramework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("name", "hong fil dong");
        prop.setProperty("age", "30");
        prop.setProperty("heigth", "178.5");
        prop.setProperty("weight", "77");

        try{
            prop.store(new FileOutputStream("profile.properties"), "profile"); // try-catch로 묶여있어야 함
            prop.storeToXML(new FileOutputStream("profile.xml"), "profile");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
