import java.sql.*;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        while (true) {
            try {
                Student s = new Student();
                Scanner sc = new Scanner(System.in);

                System.out.println("Select the option \n 1. Insert \n 2. Delete \n 3. Update \n 4. search \n 5.Exit\n ");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        s.getStudentDetails();
                        s.insertStudent();
                        break;
                    case 2:
                        s.deleteStudentRecord();
                        break;
                    case 3:
                        s.updateStudentDetails();
                        break;
                    case 4:
                        s.searchStudentRecord();
                        break;
                        case 5:
                        System.exit(0);
                    default:
                        System.out.println("Select correct option");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}