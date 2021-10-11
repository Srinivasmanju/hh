import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Options {
    Scanner sc = new Scanner(System.in);

    public void choseOption() throws SQLException {
        while (true) {
            System.out.println("Welcome To Book Store");
            System.out.println("Choose Any one Option: \n 1-UserOperations \n 2-BookOperations \n 3-CartOperations\n 4-Exit");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    userOperations();
                    break;

                case 2:
                    bookOperations();
                    break;

                case 3:
                    int count = BookStore.validateUser();
                    if (count >= 1) {
                        cartOperations();
                    } else {
                        System.out.println("Enter user id which is present in database");
                    }
                    break;
                case 4:
                    System.out.println("Thanks for using ");
                    System.exit(0);
                default:
                    System.out.println("Enter valid input");
                    break;
            }
        }
    }

    public void userOperations() throws SQLException {
        while (true) {
            System.out.println("Choose Option: \n 1-addUser \n 2-displayUsers \n 3-deleteUser\n 4-updateUser \n 5-exit");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    BookStore.addUser();
                    break;

                case 2:
                    BookStore.displayUsers();
                    break;

                case 3:
                    BookStore.deleteUser();
                    break;

                case 4:
                    BookStore.updateUser();
                    break;
                case 5:
                    choseOption();
                default:
                    System.out.println("Enter valid input");
                    break;
            }
        }
    }

    public void bookOperations() throws SQLException {
        while (true) {
            System.out.println("Choose Option: \n 1-InsertBook \n 2-Display Books \n 3-Delete Book\n 4-update Book \n 5-exit");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    BookStore.addBook();
                    break;

                case 2:
                    BookStore.displayBooks();
                    break;

                case 3:
                    BookStore.deleteBooks();
                    break;

                case 4:
                    BookStore.updateBook();
                    break;
                case 5:
                    choseOption();
                default:
                    System.out.println("Enter valid input");
                    break;
            }
        }
    }

    public void cartOperations() throws SQLException {

        while (true) {
            System.out.println("Choose Option: \n 1-Add Book To Cart \n 2-Display Books in Cart  \n 3-Delete Book from cart \n 4-exit");
            int op = sc.nextInt();
            switch (op) {
                case 1:
//                    BookStoreCaseStudy.validateBook();
//                    int count = BookStoreCaseStudy.validateBook();
//                    if (count > 0) {
//                        BookStoreCaseStudy.addBookToCart();
//                    } else {
//                        System.out.println("Books are not available in store sorry :(");
//                    }
                    BookStore.addBookToCart();
                    break;
                case 2:
                    BookStore.displayBookFromCart();
                    break;
                case 3:
                    BookStore.deleteBookFromCart();
                    break;
                case 4:
                    choseOption();
                default:
                    System.out.println("Enter valid input");
                    break;
            }
        }
    }
}