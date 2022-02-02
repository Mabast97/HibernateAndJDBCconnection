package JDBCConnection;

import teacher.Teacher;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/?user=hb_student_tracker?useSSL=false";
        String user = "hbstudent";
        String pass = "hbstudent";

        Teacher s = new Teacher("Mabast", "Hashm", 45);

        System.out.println(s);

        try {
            System.out.println("Connecting to database: "+ jdbcUrl);

            Connection myConn =
                    DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("Connection Successfull !!!");

        }catch (Exception exc){
            exc.printStackTrace();
        }
    }



}
