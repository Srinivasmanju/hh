import java.sql.*;
import java.util.Scanner;

public class Student {

    private String usn;
    private String name;
    private int age;
    private String branch;
    private String place;

    public void getStudentDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the usn");
        usn = sc.next();
        System.out.println("Enter the name");
        name = sc.next();
        System.out.println("Enter the age");
        age = sc.nextInt();
        System.out.println("Enter the branch");
        branch = sc.next();
        System.out.println("Enter the place");
        place = sc.next();
    }

    Connection con= null;
    public void insertStudent() throws ClassNotFoundException, SQLException {
        String addr = "jdbc:mysql://localhost:3306/studentdata";
        String username = "root";
        String password = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(addr, username, password);
//        System.out.println("connected");
        String sql = "insert into student values (?,?,?,?,?);";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1,usn);
        stmt.setString(2,name);
        stmt.setInt(3,age);
        stmt.setString(4,branch);
        stmt.setString(5,place);
        stmt.execute();
        System.out.println("Records inserted succesfully");
        con.close();
    }
    public void deleteStudentRecord() throws ClassNotFoundException {
        try {
            String addr = "jdbc:mysql://localhost:3306/studentdata";
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(addr, username, password);
            System.out.println("Enter the name for deleting the record");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            String sql = "delete from student where name = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,name);
            int i = stmt.executeUpdate();
            if(i > 0){
                System.out.println("Record deleted");
            }else{
                System.out.println("There is no such record");
            }
            con.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void searchStudentRecord(){
        try{
            String addr = "jdbc:mysql://localhost:3306/studentdata";
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(addr, username, password);
            System.out.println("Enter the usn for searching");
            Scanner sc = new Scanner(System.in);
            String usn1 = sc.next();
            String sql = "select * from student where usn = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,usn1);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()==false){
                System.out.println("there is no such record ");
            }else{

                    System.out.println(rs.getString(1)+"\n"+rs.getString(2)+"\n"+rs.getInt(3)+"\n"+rs.getString(4)+"\n"+rs.getString(5));

            }
            con.close();

        }catch (Exception e){
            System.out.println(e);
        }

    }
    public void updateStudentDetails() throws SQLException, ClassNotFoundException {
        String addr = "jdbc:mysql://localhost:3306/studentdata";
        String username = "root";
        String password = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(addr, username, password);
        System.out.println("Enter the name of the student");
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        System.out.println("Enter the name that you want to change");
        String name2 = sc.next();
        String sql = "update student set name = ? where name = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1,name1);
        stmt.setString(2,name2);
        int i = stmt.executeUpdate();
        if(i>0){
            System.out.println("Record updated succesfully");
        }else{
            System.out.println("no such record found");
        }
        con.close();
    }
}
