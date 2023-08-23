package day9.shapProj;

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
}
