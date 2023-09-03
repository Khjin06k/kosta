package java.practice.chap7.p22_23;

public class P23 {

    static double sumArea(Shape[] arr){
        double totalArea = 0;
        for(int i = 0; i<arr.length; i++){
            totalArea += arr[i].calcArea();
            // calcArea()를 오버라이딩 했기 때문에 부모 클래스의 메서드가 아닌 자식 클래스에 있는 메서드가 실행
        }
        return totalArea;
    }
    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        System.out.println("면적의 합:"+sumArea(arr));
    }
}
