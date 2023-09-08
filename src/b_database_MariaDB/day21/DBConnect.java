package b_database_MariaDB.day21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnect {
    // DB Connection 연결
    public static Connection getConnection(){
        Connection conn = null;
        // 연결과 관련된 실행은 try-catch문이 아니라면 에러 발생
        try {
            // mariadb driver 설정
            Class.forName("org.mariadb.jdbc.Driver");
            // url(localhost:포트번호는 변경될 수 있음), 계정, pw
            conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/testdb", "root", "admin1234");
            System.out.println("Success db connection");
        }catch(Exception e){
        e.printStackTrace();;
        } /*finally { // 연결하자마자 닫으면 안되기 때문에 분리 필요
            try{
                if(conn != null) conn.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }*/
        return conn;
    }

    // DB Connection 닫기
    public static void close(Connection conn){
        try{
            if(conn != null) conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // 쿼리문을 만들어 실행
    public static void insertUser(String id, String name){
        Connection conn = getConnection(); // Connnection 호출
        String sql = String.format("insert into user (id, name) values ('%s', '%s')", id, name); // 쿼리 명령어를 가져올 때 마지막에 세미콜론을 붙이지 않음
        Statement stmt = null;
        try{
            stmt = conn.createStatement(); // 모든 시작은 Connection으로부터.
            int cnt = stmt.executeUpdate(sql); // 테이블의 데이터를 바꾸는 것(SELECT, UPDATE, DELETE)에는 ㄷexecuteUpdate를 사용
            System.out.println(cnt + "개 데이터 삽입");
        }catch(Exception e){
            e.printStackTrace();;
        }finally {
            try{
                if(stmt != null) stmt.close(); // connection보다 나중에 열었기 때문에 먼저 닫아야 함
            }catch (Exception e){
                e.printStackTrace();
            }
            close(conn); // Connection 닫는 메서드 호출
        }
    }
    public static void main(String[] args) {
        insertUser("song", "송길동");
    }
}
