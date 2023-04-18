package TextGui;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.example.*;

import java.util.Locale;
import java.util.Scanner;

import static TextGui.DummyData.listOfFacultymembers;
import static TextGui.DummyData.listOfStudents;
import static TextGui.GUI.*;

public class MainGUI {

    @SuppressFBWarnings("DM_DEFAULT_ENCODING")
    public static void main(String[] args) throws UserOrBookDoesNotExistException {
        LibrarySystem librarySystem = new LibrarySystem();

        Scanner in = new Scanner(System.in); // Scanner to get input from user
        int input; // int to get the Integer from scanner
        String userName; // String to collect the username when logging in
        String bookString; // string to collect the book name
        Student student = null; // Empty Student incase a students logs in we make student = that student
        FacultyMember facultyMember = null; // Empty Faculty member incase a faculty member logs in we make facultymember = that faculty memeber
        boolean studentBoolean = false; // Boolean funtion the check if student logs in, becomes true if student logs in

        while (true) {
            System.out.println("please type your Username");
            userName = in.next().toLowerCase();

            studentBoolean = login(userName); //loging in and checking if its student (Boolean true) or faculty member (boolean false)

            //Creating a user either Student or Facultymember depands on studentBoolean
            if (studentBoolean) {
                for (Student student2 : listOfStudents()) {
                    if (student2.getName().toLowerCase(Locale.ROOT).equals(userName)) {
                        student = new Student(student2.getName(), student2.isFeePaid());
                    }
                }

            } else {
                for (FacultyMember facultyMember2 : listOfFacultymembers()) {
                    if (facultyMember2.getName().toLowerCase(Locale.ROOT).equals(userName)) {
                        facultyMember = new FacultyMember(facultyMember2.getName(), facultyMember2.getDepartment());
                    }
                }

            }
            //Getting input for opperation
            input = in.nextInt();
            in.nextLine();


            checkForOperation(input, studentBoolean);
            // we just printed books after we check for opperation and gathering the input from user

            bookString = in.nextLine().toLowerCase();

            Book book;
            //checking the input for book if its valid book becomes that input
            book = checkForBook(bookString);
            //using the data to prefor the opperation asked for
            preformOperation(input, studentBoolean, userName, student, facultyMember, book, librarySystem);


        }
    }
}
