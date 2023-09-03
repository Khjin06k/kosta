package java.bankProj.exc;

public class BankException extends Exception{
    BankError errCode;

    public BankException(){}
    public BankException(String msg, BankError errCode){
        super(msg); // 부모에게 정보를 넘김 >> Exception이 아닌 Object
        this.errCode = errCode;
    }

    @Override
    public String toString(){ // Object가 가지고 있는 메서드를 오버라이딩 (자식을 위해 생성한 메서드)
        // toString은 해당 클래스가 가진 정보를 문자열로 출력하라는 의미
        String message = "[" + super.getMessage()+"] ";
        switch (errCode){
            case NOID: message+="계좌번호 오류입니다."; break;
            case EXISTID: message += "계좌번호가 중복됩니다."; break;
            case LACK: message += "잔액이 부족합니다."; break;
            case MINUS: message += "입금액 오류입니다."; break;
            case MENU: message += "잘못 선택하셨습니다."; break;
            default: message += "일반 오류입니다."; break;
        }
        return message;
    }
}
