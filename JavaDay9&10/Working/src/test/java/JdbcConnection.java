import java.sql.*;
import java.util.Scanner;

public class JdbcConnection {
    public static void main(String[] args) throws SQLException {
        Connection con=null;
        Statement stm;
        try {
            String addr="jdbc:mysql://localhost:3306/demo";
            String username="root";
            String password="vtiger";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(addr,username,password);

            Scanner sc=new Scanner(System.in);
            String pri_name=sc.next();
            String current_name=sc.next();
            String sql1="update student set name=? where name=?";
            PreparedStatement pstm=con.prepareStatement(sql1);
            pstm.setString(1,pri_name);
            pstm.setString(2,current_name);

            int status= pstm.executeUpdate();
            if(status==0){
                System.out.println("enter the name which is present in table");
            }
            /*stm= con.createStatement();
            String sql="delete from student where usn='4mn'";
            String sql1="update student set name='hemanth' where name='rakesh'";
            int status=stm.executeUpdate(sql1);*/
            System.out.println(status);



            System.out.println("updated");
        }
        catch (ClassNotFoundException e){

            System.out.println(e.getException());

        }
        catch (SQLException e){
            System.out.println(e.getNextException());
        }
        finally {
            con.close();
        }

    }

}
