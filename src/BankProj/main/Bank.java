package BankProj.main;

import BankProj.acc.Account;
import BankProj.acc.SpecialAccount;
import BankProj.exc.BankError;
import BankProj.exc.BankException;

import java.util.Scanner;


public class Bank{
    Account[] accs = new Account[100];
    int accCnt;
    Scanner sc = new Scanner(System.in);

    int menu() throws BankException{ // 메서드에 throws를 사용할 경우 throw 던져도 됨
        System.out.println("[코스타 은행]");
        System.out.println("0. 종료");
        System.out.println("1. 계좌 개설");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("4. 계좌 조회");
        System.out.println("5. 전체 계좌 조회");
        System.out.print(">> 선택 ");
        int sel = Integer.parseInt(sc.nextLine());
        if(!(sel>=0 && sel <=5)){
            //try{ // try-catch를 이용해서 잘못 골랐을 때 다시 menu()를 호출하도록 설정도 가능
                throw new BankException("메뉴오류", BankError.MENU); // msg, errCode 입략
            //}catch (BankException e){
            //    System.out.println(e); // println을 사용했기 때문에 e.toString()이 호출됨
            //    menu();
            //}
        }
        //return  sc.nextInt();
        return sel;
    }

    void selAccMenu() throws BankException{
        System.out.println("[계좌 개설]");
        System.out.println("1. 일반 계좌");
        System.out.println("2. 특수 계좌");
        System.out.print("선택 >> ");
        int sel = Integer.parseInt(sc.nextLine());
        switch (sel){
            case 1 : makeAccount(); break;
            case 2 : makeSpecialAccount(); break;
            default:
                //try{
                    throw new BankException("잘못 선택", BankError.MENU);
                    // >> 다시 맨 처음으로 가게되면 예외를 그냥 메서드에 위임해주면 됨
                    // 그게 아니라 selAccMenu()로 돌아가고 싶다면 try-catch문을 써야 함
                    // 혹은 예외문을 아예 다 다르게 하면 됨
                //}catch (Exception e){
                //    System.out.println(e);
                //    selAccMenu();
                //}
        }
        //if(sel == 1) makeAccount();
        //else makeSpecialAccount();
    }

    // 계좌 개설
    void makeAccount()throws BankException{
        System.out.println("[계좌 개설]");
        System.out.print("계좌번호 : ");
        String id = sc.nextLine();
        Account acc = searchAccById(id);
        if(acc!=null){
            throw new BankException("계좌 중복", BankError.EXISTID);
            //System.out.println("중복된 계좌가 있습니다.");
            //return;
        }
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("입금액 : ");
        int money = Integer.parseInt(sc.nextLine());
        if(accCnt == accs.length) System.out.println("개설 가능한 계좌 수가 넘어 개설 불가능합니다.");
        else accs[accCnt++] = new Account(id, name, money);
    }
    // 특수 계좌 개설
    void makeSpecialAccount() throws BankException{
        System.out.println("[특수 계좌 개설]");
        System.out.print("계좌 번호 : ");
        String id = sc.nextLine();
        Account acc = searchAccById(id);
        if(acc!=null){
            throw new BankException("계좌 중복", BankError.EXISTID);
            //System.out.println("중복된 계좌가 있습니다.");
            //return;
        }
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("입금액 : ");
        int money = Integer.parseInt(sc.nextLine());
        System.out.print("등급(VIP-V, Gold-G, Silver-S, Normal-N) : ");
        String grade = sc.nextLine();
        // 등급을 잘못 입력 받았을 경우 잘못된 등급임을 알리기
        if(!grade.equals("V") && !grade.equals("G") && !grade.equals("S") && !grade.equals("N")){
            System.out.println("잘못된 등급입니다. Normal 등급으로 설정되었습니다.");
        }
        if(accCnt == accs.length) System.out.println("개설 가능한 계좌 수가 넘어 개설 불가능합니다.");
        else accs[accCnt++] = new SpecialAccount(id, name, money, grade); // 다형성 이용하여 부모 클래스 타입의 배열에 생성 가능
    }

    // 계좌번호에 따른 사용자 조회
    Account searchAccById(String id){
        for(int i = 0; i<accCnt; i++){
            if(accs[i].getId().equals(id)){
                return accs[i];
            }
        }
        return null;
    }

    // 입금
    void deposit() throws BankException{
        System.out.print("입금할 계좌의 계좌번호를 입력하세요 >> ");
        String id = sc.nextLine();
        Account acc = searchAccById(id);
        if(acc == null){
                throw new BankException("계좌 없음", BankError.NOID);
        }

        System.out.print("입금액 : ");
        int money = Integer.parseInt(sc.nextLine());
        /*if(acc instanceof SpecialAccount){ // 오버라이딩했기 때문에 다운캐스팅을 해줄 필요가 없음
           money = (int)(money * ((SpecialAccount)acc).moneys(acc));
        }*/
        acc.deposit(money);
    }

    // 출금
    void withdraw() throws BankException{
        System.out.print("출금할 계좌의 계좌번호를 입력하세요 >> ");
        String id = sc.nextLine();
        Account acc = searchAccById(id);

        if(acc == null){
            throw new BankException("계좌 없음", BankError.NOID);
        }

        System.out.print("출금액 : ");
        int money = Integer.parseInt(sc.nextLine());
        acc.withdraw(money);
    }

    // 계좌 조회
    void accountInfo() throws BankException{
        System.out.print("조회할 계좌의 계좌번호를 입력하세요 >> ");
        String id = sc.nextLine();
        Account acc = searchAccById(id);

        if(acc == null){
            throw new BankException("계좌 오류", BankError.NOID);
        }

        System.out.println(acc);; // 오버라이딩 했기 때문에 다운캐스팅을 할 필요가 없음
    }

    // 전체 계좌 조회
    void allAccountInfo(){
        for(int i = 0; i<accCnt; i++){ // 전체 배열을 돌릴 필요 없이 값이 존재하는 곳 까지만 반복을 돌리기 위해 accCnt 만큼만 반복 진행
            if(accs[i] instanceof SpecialAccount){
                System.out.println((SpecialAccount)accs[i]);
            }
            System.out.println(accs[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();
        int sel;
        while(true){
            try {
                sel = bank.menu();

                if (sel == 0) break;
                switch (sel) {
                    case 1:
                        bank.selAccMenu();
                        break;
                    case 2:
                        bank.deposit();
                        break;
                    case 3:
                        bank.withdraw();
                        break;
                    case 4:
                        bank.accountInfo();
                        break;
                    case 5:
                        bank.allAccountInfo();
                        break;
                }
            }catch(NullPointerException e){
                System.out.println("입력 형식이 맞지 않습니다. 다시 선택하세요.");
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
