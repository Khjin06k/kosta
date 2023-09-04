package a_java.day11;

class MyButton{
    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    void click(){
        System.out.println("쏙 들어갔다 나옴");
    }
}
class LoginButton extends MyButton{
    @Override
    void click(){ // 다른 버튼을 눌러야 하는 기능이 많은데 한 번만 사용하기 위해 상속을 받는 것은 비효율적 >> 인터페이스를 이용해야 함 >> InterfaceTest3 참고
        super.click();
        System.out.println("로그인 처리");
    }
}
public class InterfaceTest2 {
    public static void main(String[] args) {
        MyButton loginBtn = new MyButton();
        loginBtn.setTitle("로그인");
        loginBtn.click(); // 클릭 시 로그인 처리를 해줘야 함 >> 이미 만들어있는 것과 다름
    }
}
