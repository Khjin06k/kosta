package day9.Package;

import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Date;

import java.util.Scanner; // package와 class 사이에 임폴트 위치

public class MyClass {
    Scanner sc = new Scanner(System.in);
    public Date date1;
    java.util.Date date2; // 다른 패키지의 동일한 이름의 클래스를 둘 다 사용하고 싶은 경우 임폴트는 하나만 하고 다른 하나는 달고 다녀야 함
    FileReader fr;
    FileWriter fw;

    public MyClass(){} // 같은 패키지가 아니라면 public을 붙여줘야 함 (생성자, 클래스 모두)


}
