package java.bankProj.main;

import java.bankProj.acc.Account;
import java.bankProj.acc.SpecialAccount;
import java.bankProj.exc.BankError;
import java.bankProj.exc.BankException;

import java.io.*;
import java.util.*;


public class Bank{
    Map<String, Account> accs = new TreeMap<>(); // Tree는 자동 정렬 >> id 기준으로 정렬됨
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
        //Account acc = searchAccById(id);
        if(accs.containsKey(id)){
            throw new BankException("계좌 중복", BankError.EXISTID);
            //System.out.println("중복된 계좌가 있습니다.");
            //return;
        }
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("입금액 : ");
        int money = Integer.parseInt(sc.nextLine());
        //if(accCnt == accs.size()) System.out.println("개설 가능한 계좌 수가 넘어 개설 불가능합니다.");
        accs.put(id, new Account(id, name, money));
    }
    // 특수 계좌 개설
    void makeSpecialAccount() throws BankException{
        System.out.println("[특수 계좌 개설]");
        System.out.print("계좌 번호 : ");
        String id = sc.nextLine();
        //Account acc = searchAccById(id);
        if(accs.containsKey(id)){
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
        //if(accCnt == accs.size()) System.out.println("개설 가능한 계좌 수가 넘어 개설 불가능합니다.");
        else accs.put(id, new SpecialAccount(id, name, money, grade)); // 다형성 이용하여 부모 클래스 타입의 배열에 생성 가능
    }

    // 계좌번호에 따른 사용자 조회
    /*Account searchAccById(String id){

        for(Account acc : accs){
            if(acc.getId().equals(id)) return acc;
        }
       *//* 위 향상된 for문으로 변경 가능
       for(int i = 0; i<accCnt; i++){
            if(accs.get(i).getId().equals(id)){
                return accs.get(i);
            }
        }*//*
        return null;
    }*/

    // 입금
    void deposit() throws BankException{
        System.out.print("입금할 계좌의 계좌번호를 입력하세요 >> ");
        String id = sc.nextLine();
        //Account acc = searchAccById(id);
        if(!accs.containsKey(id)){
                throw new BankException("계좌 없음", BankError.NOID);
        }

        System.out.print("입금액 : ");
        int money = Integer.parseInt(sc.nextLine());
        /*if(acc instanceof SpecialAccount){ // 오버라이딩했기 때문에 다운캐스팅을 해줄 필요가 없음
           money = (int)(money * ((SpecialAccount)acc).moneys(acc));
        }*/
        accs.get(id).deposit(money);
    }

    // 출금
    void withdraw() throws BankException{
        System.out.print("출금할 계좌의 계좌번호를 입력하세요 >> ");
        String id = sc.nextLine();
        //Account acc = searchAccById(id);

        if(!accs.containsKey(id)){
            throw new BankException("계좌 없음", BankError.NOID);
        }

        System.out.print("출금액 : ");
        int money = Integer.parseInt(sc.nextLine());
        accs.get(id).withdraw(money);
    }

    // 계좌 조회
    void accountInfo() throws BankException{
        System.out.print("조회할 계좌의 계좌번호를 입력하세요 >> ");
        String id = sc.nextLine();
        //Account acc = searchAccById(id);

        if(!accs.containsKey(id)){
            throw new BankException("계좌 오류", BankError.NOID);
        }

        System.out.println(accs.get(id));; // 오버라이딩 했기 때문에 다운캐스팅을 할 필요가 없음
    }

    // 전체 계좌 조회
    void allAccountInfo(){
        System.out.println("[전체 계좌 조회]");
        Iterator<Account> it = accs.values().iterator();
        while(it.hasNext()){
            System.out.println(it.next()); // 왜 다운캐스팅을 하지 않아도 되는가?
        }
         /*위처럼 Iterator 사용 가능

        향상된 for문으로 변경 가능
        for(Account acc : accs제.values()){
            if(acc instanceof SpecialAccount){
                System.out.println((SpecialAccount)acc);
            }
            System.out.println(acc);
        }

        for(int i = 0; i<accCnt; i++){ // 전체 배열을 돌릴 필요 없이 값이 존재하는 곳 까지만 반복을 돌리기 위해 accCnt 만큼만 반복 진행
            if(accs.get(i) instanceof SpecialAccount){
                System.out.println((SpecialAccount)accs.get(i));
            }
            System.out.println(accs.get(i));
        }*/
    }

    public void store_b(){
        DataOutputStream dao = null;
        try{
            dao = new DataOutputStream(new FileOutputStream("accs.bin"));
            dao.writeInt(accs.size()); // 계좌 개수 저장
            for(Account acc : accs.values()){
                if(acc instanceof SpecialAccount){
                    dao.writeChar('S'); // SpeciailAccount 계좌일 경우
                }else{
                    dao.writeChar('N'); // 일반 계좌일 경우
                }
                dao.writeUTF(acc.getId()); // 계좌번호
                dao.writeUTF(acc.getName()); // 이름
                dao.writeInt(acc.getBalance()); // 잔액
                if(acc instanceof SpecialAccount){
                    dao.writeUTF(((SpecialAccount) acc).getGrade()); // 등급
                }
            }
        }catch (IOException e){
            // e.printStackTrace();
        }finally {
            try{
                if(dao != null) dao.close();
            }catch (IOException e){
                // e.printStackTrace();
            }
        }
    }
    public void store_t(){
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter("accs.bin"));
            for(Account acc : accs.values()){
                String accStr = acc.getId();
                accStr+=","+acc.getName();
                accStr+=","+acc.getBalance();
                if(acc instanceof SpecialAccount){
                    accStr+=","+((SpecialAccount)acc).getGrade().charAt(0);
                }
                bw.write(accStr);
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(bw != null) bw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public void load_t(){
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("accs.bin"));
            String accStr = null;
            while((accStr=br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(accStr, ",");
                String id = st.nextToken();
                String name = st.nextToken();
                int balance = Integer.parseInt(st.nextToken());
                if(st.countTokens() != 0){ // 토큰이 남아있는 것이 있다면
                    String grade = st.nextToken();
                    accs.put(id, new SpecialAccount(id, name, balance, grade));
                }else{
                    accs.put(id, new Account(id, name, balance));
                }
               /* String[] accProp = accStr.split(",");
                String id = accProp[0];
                String name = accProp[1];
                int balance = Integer.parseInt(accProp[2]);
                if(accProp.length == 4){
                    String grade = accProp[3];
                    accs.put(id, new SpecialAccount(id, name, balance, grade));
                }else{
                    accs.put(id, new Account(id, name, balance));
                }*/
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(br != null) br.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void load_b(){
        DataInputStream dis = null;
        try{
            dis = new DataInputStream(new FileInputStream("accs.bin"));
            int count = dis.readInt();
            for(int i = 0; i<count; i++){
                char sect = dis.readChar(); // 계좌 종료 구분
                String id = dis.readUTF(); // 계좌 번호
                String name = dis.readUTF(); // 이름
                int balance = dis.readInt(); // 잔액
                if(sect == 'S') {
                    String grade = dis.readUTF(); // 등급 >> 맨 앞 한글자만 입력 받아서 생성하기 때문에 아래 생성자 생성시 맨 처음 한글자만 가져와서 생성 진행
                    accs.put(id, new SpecialAccount(id, name, balance, grade.charAt(0)+""));
                }else{
                    accs.put(id, new Account(id, name, balance));
                }
            }
        }catch (IOException e){
            // e.printStackTrace();
        }finally {
            try{
                if(dis != null) dis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void store_s(){
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream("accs.dat"));
            oos.writeObject(accs);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(oos != null) oos.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public void load_s(){
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream(new FileInputStream("accs.dat"));
            accs = (Map<String, Account>)ois.readObject();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(ois != null) ois.close();
            }catch (IOException  e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();
        //bank.load_b();
        bank.load_t();

        int sel;
        while(true){
            try {
                sel = bank.menu();

                if (sel == 0){
                    //bank.store_b(); // 0이면 종료이므로 종료 시 한 번에 저장 및 종료 진행
                    bank.store_t();;
                    break;
                }
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
