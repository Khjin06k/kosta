package a_java.day9.shapProj;

public class ShapeSet {
    Shape[] shapes = new Shape[100];
    int count;

    public void add(Shape ss){
        shapes[count++] = ss;
    }

    public void allShapeDraw(){
        for(int i = 0; i<count; i++){
            System.out.println(shapes[i].info());
        }
    }
}
