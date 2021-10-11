import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//JdbcConnection
public class WorkingExample {
    public static void main(String[] args){
        Statement stm;
        try {
            String addr="jdbc:mysql://localhost:3306/db_shopon";
            String username="root";
            String password="root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(addr,username,password);
            System.out.println("connection is established");


        }
        catch (ClassNotFoundException e){
            System.out.println("class not found");

        }
        catch (SQLException e){
            System.out.println(e.getNextException());
        }
   finally {
            System.out.println();
        }
    }

}
