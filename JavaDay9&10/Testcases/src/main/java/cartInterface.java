import java.sql.SQLException;

public interface cartInterface {
    public static int validateUser() throws SQLException{
        return 0;
    }
    public static void addBookToCart(){

    } //all display in bookstore/ book.delete
    public static void deleteBookFromCart(){

    }
    public static void displayBookFromCart(){

    }
   // public void checkuserinlist();  //this method will check that user is present in user table

}


//carttable(cartid,bookname,userid,number of copies)
//wwhen add book to cart, check the user is present in the userid => userid
//1:addBooktocart/ /check the  bookname is present in the cart table along with userid no book name add book name,
// otherwise increase the number of copies to one sql(select * from cartTable where bookname=name, userid=id) status=1 update increases the number of copies to one//userid
//2:delete if no book and decrease