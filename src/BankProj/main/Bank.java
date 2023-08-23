package BankProj.main;

import BankProj.acc.Account;

import java.util.Scanner;


public class Bank {
    Account[] accs = new Account[100];
    int accCnt;
    Scanner sc = new Scanner(System.in);

    int menu(){
        System.out.println("[코스타 은행]");
        System.out.println("0. 종료");
        System.out.println("1. 계좌 개설");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("4. 계좌 조회");
        System.out.println("5. 전체 계좌 조회");
        System.out.print(">> 선택 ");
        //return  sc.nextInt();
        return Integer.parseInt(sc.nextLine());
    }

    // 계좌 개설
    void makeAccount(){
        System.out.println("[계좌 개설]");
        System.out.print("계좌번호 : ");
        String id = sc.nextLine();
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("입금액 : ");
        int money = Integer.parseInt(sc.nextLine());
        if(accCnt == accs.length) System.out.println("개설 가능한 계좌 수가 넘어 개설 불가능합니다.");
        else accs[accCnt++] = new Account(id, name, money);
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
    void deposit(){
        System.out.print("입금할 계좌의 계좌번호를 입력하세요 >> ");
        String id = sc.nextLine();
        Account acc = searchAccById(id);
        if(acc == null){
            System.out.println("계좌번호가 틀립니다.");
            return;
        }
        System.out.print("입금액 : ");
        int money = Integer.parseInt(sc.nextLine());
        acc.deposit(money);
    }

    // 출금
    void withdraw(){
        System.out.print("출금할 계좌의 계좌번호를 입력하세요 >> ");
        String id = sc.nextLine();
        Account acc = searchAccById(id);
        if(acc == null){
            System.out.println("계좌번호가 틀립니다.");
            return;
        }
        System.out.print("출금액 : ");
        int money = Integer.parseInt(sc.nextLine());
        acc.withdraw(money);
    }

    // 계좌 조회
    void accountInfo(){
        System.out.print("조회할 계좌의 계좌번호를 입력하세요 >> ");
        String id = sc.nextLine();
        Account acc = searchAccById(id);
        if(acc == null){
            System.out.println("계좌번호가 틀립니다.");
            return;
        }
        acc.info(acc);
    }

    // 전체 계좌 조회
    void allAccountInfo(){
        for(int i = 0; i<accCnt; i++){ // 전체 배열을 돌릴 필요 없이 값이 존재하는 곳 까지만 반복을 돌리기 위해 accCnt 만큼만 반복 진행
            System.out.println("계좌번호 : " + accs[i].getId() + ", 이름 : " + accs[i].getName() + ", 잔액 : " + accs[i].getBalance());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();
        int sel;
        while(true){
            sel = bank.menu();
            if(sel==0) break;
            switch(sel) {
                case 1:
                    bank.makeAccount();
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
        }
    }
}
