import javax.swing.*;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.Scanner;

public class BookStore implements UserInterface,BookInterface,cartInterface{
    static Scanner sc = new Scanner(System.in);
    private static Connection con;
    private static Statement stm;
    public static void main(String[] args) throws SQLException {
        try {
            String address = "jdbc:mysql://localhost:3306/bookstore";
            String user = "root";
            String pass = "root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(address, user, pass);
            stm = con.createStatement();
            Options op=new Options();
            op.choseOption();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
    }
    public static void addUser() throws SQLException {
        System.out.println("Enter user id:");
        int u_id = sc.nextInt();
        System.out.println("Enter userName :");
        String user_name = sc.next();
        System.out.println("Enter password :");
        String pass = sc.next();
        System.out.println("Enter place :");
        String place = sc.next();
        String sqlInsert = "insert into user values(?,?,?,?)";
        PreparedStatement pstm = con.prepareStatement(sqlInsert);
        pstm.setInt(1, u_id);
        pstm.setString(2, user_name);
        pstm.setString(3, pass);
        pstm.setString(4, place);
        int status = pstm.executeUpdate();
        if (status == 0) {
            System.out.println("Enter different user id ");
        } else {
            System.out.println("Insertion done ");
        }
    }
    public static void displayUsers() throws SQLException {
        String sqlQuery = "select * from user";
        ResultSet res = stm.executeQuery(sqlQuery);
        while (res.next()) {
            System.out.println("User ID :" + res.getInt(1) + "\tUser Name :" + res.getString(2) + "\tPassword :" + res.getString(3) + "\tPlace :" + res.getString(4));
        }
    }
    public static void deleteUser() throws SQLException {
        System.out.println("Enter the user id to delete the user");
        int user_id=sc.nextInt();
        String sqlDelete="delete from user where user_id="+user_id+"";
        int deleteStatus=stm.executeUpdate(sqlDelete);
        if(deleteStatus==0){
            System.out.println("Enter the name which is present in database ");
        }else {
            System.out.println("Deletion done ");
        }
    }
    public static void updateUser() throws SQLException {
        System.out.println("Enter the user id to update the user name ");
        int u_id=sc.nextInt();
        System.out.println("Enter new name: ");
        String newName= sc.next();
        String sqlUpdate="update user set user_name='"+newName+"' where user_id="+u_id+"";
        int updateStatus=stm.executeUpdate(sqlUpdate);
        if(updateStatus==0){
            System.out.println("Enter the user id which is present in database ");
        }else {
            System.out.println("Update done ");
        }
    }
    public static void addBook() throws SQLException {
        System.out.println("Enter Book Name :");
        String book_name = sc.next();
        System.out.println("Enter Price of book :");
        double price = sc.nextDouble();
        System.out.println("Enter Number of copies :");
        int number_of_copy = sc.nextInt();
        System.out.println("Enter Author of book :");
        String writer = sc.next();
        System.out.println("Enter Year of publish:");
        int year_of_Publish = sc.nextInt();
        String sqlInsert = "insert into book_store values(?,?,?,?,?)";
        PreparedStatement pstm = con.prepareStatement(sqlInsert);
        pstm.setString(1, book_name);
        pstm.setDouble(2, price);
        pstm.setInt(3, number_of_copy);
        pstm.setString(4, writer);
        pstm.setInt(5, year_of_Publish);
        int status = pstm.executeUpdate();
        if (status == 0) {
            System.out.println("Enter different Book Name ");
        } else {
            System.out.println("Insertion done ");
        }
    }
    public static void displayBooks() throws SQLException {
        String sqlQuery = "select * from book_store";
        ResultSet res = stm.executeQuery(sqlQuery);
        while (res.next()) {
            System.out.println("Book name :" + res.getString(1) + "\tprize :" + res.getInt(2) + "\tNumber of copies : :" + res.getInt(3) + "\tWriter :" + res.getString(4) +"\tYear of publish :" + res.getInt(5));
        }
    }
    public static void deleteBooks() throws SQLException {
        System.out.println("Enter the book name to delete the book");
        String bookName=sc.next();
        String sqlDelete="delete from book_store where book_name='"+bookName+"'";
        int deleteStatus=stm.executeUpdate(sqlDelete);
        if(deleteStatus==0){
            System.out.println("Enter the Book name which is present in database ");
        }else {
            System.out.println("Deletion done ");
        }
    }
    public static void updateBook() throws SQLException {
        System.out.println("Enter the book name to change the author");
        String  bookName = sc.next();
        System.out.println("Enter new name: ");
        String author = sc.next();
        String sqlUpdate = "update book_store set writer='"+author+"' where book_name='" + bookName + "'";
        int updateStatus = stm.executeUpdate(sqlUpdate);
        if (updateStatus == 0) {
            System.out.println("Enter the book which is present in database ");
        } else {
            System.out.println("Update done ");
        }
    }
    public static int validateUser() throws SQLException {
        int count=0;
        System.out.println("Enter user id to check whether the user is present or not :");
        int u_id=sc.nextInt();
        String sqlCheck="select user_name from user where user_id="+u_id+"";
        ResultSet res=stm.executeQuery(sqlCheck);
        while (res.next()){
            count++;
        }
        if(count>=1){
            System.out.println("user is present and can perform task");
        }
        return count;
    }
    //    public static int validateBook() throws SQLException {
//        int count=0;
//        System.out.println("Enter Book to check whether the book present or not :");
//        String  bookName=sc.next();
//        String sqlCheck="select bookName from book where bookName='"+bookName+"'";
//        ResultSet res=stm.executeQuery(sqlCheck);
//        while (res.next()){
//            count++;
//        }
//        if(count>=1){
//            System.out.println("Book is present and can perform task");
//        }
//        return count;
//    }
    public static void addBookToCart() throws SQLException {
        int noOfCopies = 0;
        System.out.println("Enter the user_id");
        int u_id = sc.nextInt();
        System.out.println("Enter book Name to add in cart");
        String book_name = sc.next();
        System.out.println("Enter no fo copies to add in cart");
        int addCopies = sc.nextInt();
        String checkCopies = "select number_of_copy from book_store where book_name =" +"'" + book_name + "'"+ " ";
        ResultSet resNoOfCopies = stm.executeQuery(checkCopies);
        while (resNoOfCopies.next()) {
            noOfCopies = resNoOfCopies.getInt(1);
        }
        if (noOfCopies >= addCopies) {
            String sqlInsertBookInCart = "insert into cart values('" + book_name + "'," + u_id + "," + addCopies + ")";
            int status = stm.executeUpdate(sqlInsertBookInCart);
            noOfCopies=noOfCopies-addCopies;
            if (status == 0) {
                System.out.println("Enter different Book Name ");
            } else {
                System.out.println("Insertion into cart done ");
            }
            if (status > 0) {
                if (noOfCopies > 0) {
                    String decrementCopies = "update book_store set number_of_copy=" + noOfCopies + " where book_name='" + book_name + "'";
                    stm.executeUpdate(decrementCopies);
                } else {
                    String deleteBook = "delete from book_store where book_name='" + book_name + "'";
                    stm.executeUpdate(deleteBook);
                }
            }
        }
        else {
            System.out.println("Book not present");
        }
    }

    public static void displayBookFromCart() throws SQLException {
        System.out.println("Enter u_id to show the data");
        int u_id=sc.nextInt();
        String sqlDisplayCart="select book_name,number_of_copy from cart where user_id="+u_id+"";
        ResultSet res=stm.executeQuery(sqlDisplayCart);
        while (res.next()){
            System.out.println("Book Name: "+res.getString(1)+" No of Copies: "+res.getInt(2));
        }
    }

    public static void deleteBookFromCart() throws SQLException {
        int noOfCopies=0;
        int  bookCopies=0;
        System.out.println("Enter u_id");
        int u_id=sc.nextInt();
        System.out.println("Enter book name to delete from cart");
        String bookName=sc.next();
        String queryCheck="select number_of_copy from cart where user_id="+u_id+" and book_name='"+bookName+"'";
        ResultSet res=stm.executeQuery(queryCheck);
        while (res.next()){
            noOfCopies=noOfCopies+res.getInt(1);
        }
        String deleteBook="delete from cart where user_id="+u_id+" and book_name='"+bookName+"'";
        int status=stm.executeUpdate(deleteBook);
        if(status>0){
            System.out.println("Deletion done in cart");
            String checkCopiesInBook="select number_of_copy from book_store where book_name='"+bookName+"'";
            ResultSet resCheck=stm.executeQuery(checkCopiesInBook);
            while (resCheck.next()){
                bookCopies=resCheck.getInt(1);
            }
            bookCopies=bookCopies+noOfCopies;

            String updateBook="update book_store set number_of_copy="+bookCopies+" where book_name='"+bookName+"'";
            stm.executeUpdate(updateBook);
        }
        else {
            System.out.println("Book not present in cart");
        }
    }

}



