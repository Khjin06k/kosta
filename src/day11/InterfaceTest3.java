package day11;
// (1) 인터페이스와 BasicButton은 이미 만들어져있다고 생각하면 됨 >> 사용자가 편리하게 가져다쓰라고 만들어진것
interface IClick{
    void iClick();
}
class BasicButton{
    String title;
    IClick iClick; // (1) 인터페이스를 변수로 가져올 수 있음 >> 로그인 처리를 내가 해서 가져가야 한다는 것
    void click(){
        System.out.println("기본 버튼 처리");
        if(iClick != null){
            iClick.iClick();
        }
    }
    void addClickEventHandler(IClick iClick){
        this.iClick = iClick;
    }
}
class LoginClick implements IClick{
    @Override
    public void iClick() {
        System.out.println("로그인 처리");
    }
}

public class InterfaceTest3 {
    public static void main(String[] args) {
        BasicButton loginBtn = new BasicButton(); // (2) 객체를 생성
        loginBtn.addClickEventHandler(new LoginClick()); // (4) 이를 사용하지 않으면 iclick이 null이기 때문에 아무것도 이벤트가 나지 않음
        // (3) 버튼의 기능을 함수로 만들어서 넣어주어야 함
        // 자바는 메서드만 만들 수 없기 때문에 인터페이스나 클래스에 메서드가 들어가야 함. 따라서 메서드를 주고받는 것이 아니라 메서드를 가지고 있는 인터페이스를 주고 받고
        // 인터페이스에 그 메서드가 있다는 것의 약속이 됨 >> 맨 위의 인터페이스
        // 따라서 클릭 인터페이스를 상속받아서 내가 새로 구현한 것을 로그인 버튼에 넣어주는 것 >> 아래 메서드를 호출시켜줌
        loginBtn.click();

        BasicButton joinBtn = new BasicButton();
        joinBtn.addClickEventHandler(new IClick() {
            // (5) 회원가입 버튼으로 위의 클래스를 만들지 않고 아래에서 바로 클래스를 생성함 (일회성이므로 익명 클래스 생성)
            // new IClick이 부모 클래스명(인터페이스, 클래스 모두 올 수 있음) 이 오고 미완성 메서드이기 때문에 미완성 메서드는 알아서 오버라이딩하여 메서드를 만들어줌
            // 이를 익명 클래스(이름이 없는 클래스) 혹은 내부 클래스(클래스 안에 클래스)
            @Override
            public void iClick() {
                System.out.println("회원가입 처리");
            }
        });

    }
}
