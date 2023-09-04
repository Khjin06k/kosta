package a_java.day9.shapProj;

public class Shape {
    String color; // 색상
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(){}
    public Shape(String color){
        this.color = color;
    }

    public String info(){
        return "색(" + color+"), ";
    }
    // info()를 추상 메서드로 남겨두고 Shape을 추상클래스로 설정해도 됨

   // public abstract void draw();
}
