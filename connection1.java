import java.lang.*;
import java.sql.*;
class Connection1
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded..........");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gec?user=root&password=Ujwala@123");
        System.out.println("connection established.....");
        Statement stmt=con.createStatement();
        stmt.execute("create table emp1(eno int,ename varchar(20))");
        System.out.println("emp table is created");
        //con.close();
    }
}