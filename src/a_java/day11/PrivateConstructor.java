package a_java.day11;

class MyArray{
    private int[] arr = new int[10];
    private static MyArray myArray; // (5) static 메서드에서는 static 변수만 접근 가능하기에 static 설정, 유일해야 하기도 함
    private MyArray(){} // (1) private 생성자는 밖에서 호출이 불가능하며, 밖에서 생성자 생성 불가
    // (2) private은 동일한 클래스 내에서는 생성이 가능하기 때문에 안에서 생성
    // (4) new를 할 수 없지만 생성자를 가져와야 하기 때문에 static을 통해서 바로 생성해 가져갈 수 있음
    public static MyArray getMyArrayReference(){ // (3) 이 함수를 통해서 생성자를 생성해서 밖에서 호출할 수 있음
        if(myArray == null){ // (5) null 일 때에만 생성하고, null 이 아니면 생성된 것을 사용 >> private을 사용하는 이유
            myArray = new MyArray(); // (6) 생성하지 말고 하나를 가지고 같이 사용해 라는 의미 >> 싱글톤 객체 : 생성자를 private으로 만듦으로서 내부적으로 생성자를 하나를 만들어 같이 사용하는 것
        }
        return myArray;
    }

    // (7) 하나를 가지고 같이 사용하는 것을 확
    public void setData(int idx, int data){
        arr[idx] = data;
    }
    public int getData(int idx){
        return arr[idx];
    }
}

public class PrivateConstructor {
    public static void main(String[] args) {
        // MyArray ma = new MyArray(); // (1) 생성자가 private이기 때문에 가져와서 생성 불가능

        MyArray ma1 = MyArray.getMyArrayReference(); // (3), (4)
        MyArray ma2 = MyArray.getMyArrayReference(); // (5) - 두번째 호출한 것이기 때문에 (5) 에 의해서 null 이 아니므로 첫번째의 ma1이 호출
        System.out.println(ma1 == ma2);

        // (7) 하나를 가지고 같이 사용함을 알 수 있음
        ma1.setData(0, 100);
        System.out.println(ma2.getData(0)); // 100 출력
    }
}
