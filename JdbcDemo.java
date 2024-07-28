import java.sql.*;
class DAO
{
    Connection con;
    DAO() throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("system loaded");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gec?user=root&password=Ujwala@123");
    }
    void insert(int eno,String ename) throws Exception
    {
        Statement stmt=con.createStatement();
        int r=stmt.executeUpdate("insert into emp values("+eno+","+ename+")");
        boolean b=stmt.execute("select * from emp");
        System.out.println(b);
        if(r==1){
            System.out.println("inserted.......");
        }    
        else{
            System.out.println("not inserted...");
        }        
    }
    void updateName(int eno,String ename) throws Exception
    {
        String cmd="update emp set ename=? where eno=?";
        PreparedStatement pstmt=con.prepareStatement(cmd);
        pstmt.setString(1,ename);
        pstmt.setInt(2,eno);
        int r=pstmt.executeUpdate();
        if(r==1){
        System.out.println("update...name.");
        }
        else{
        System.out.println("failed....to.update");
        }
    }
    void deleteEmp(int eno) throws Exception
    {
        String cmd="delete from emp where eno=?";
        PreparedStatement pstmt=con.prepareStatement(cmd);
        pstmt.setInt(1,eno);
        int r=pstmt.executeUpdate();
        if(r==1)
        System.out.println("delete...name.");
        else
        System.out.println("delete failed.........");
    }
    void viewAll() throws Exception
    {
        String cmd="select * from emp";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(cmd);
        while(rs.next())
        {
            System.out.println("%-5d %-30s",rs.getInt("eno"),rs.getString("ename"));
        }
    }

}
public class JdbcDemo
{
    public static void main(String[] args) throws Exception
    {
        DAO dao=new DAO();
        dao.insert(11,"dhoni");
        //dao.updateName(eno:1,ename:"ujju");
    }
}
