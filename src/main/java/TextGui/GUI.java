package TextGui;

import org.example.*;

import java.time.LocalDate;
import java.util.Locale;

import static TextGui.DummyData.*;

public class GUI {
    //Funtion for login takes in string username and compares it with students and faculty memebers name in the dummy database,
    // has its flaws f.x. can just have one name in the system need to make student and faculty member have usernames
    // is a boolean function so we can see if we are logged in or not
    public static boolean login(String username) {
        boolean loggedIn = false;
        int userInt = -1;
        for (int i = 0; i < listOfStudents().toArray().length; i++) {
            if (username.equals(listOfStudents().get(i).getName().toLowerCase())) {
                System.out.println("Logged in as " + username + " Student");
                loggedIn = true;
                System.out.println("Type 1 for Renting, 2 for Returning or 3 for Extending rental period and press enter");
                loggedIn = true;
                return true;

            }
        }
        if (!loggedIn) {
            for (int k = 0; k < listOfFacultymembers().toArray().length; k++) {
                if (username.equals(listOfFacultymembers().get(k).getName().toLowerCase())) {
                    System.out.println("Logged in as " + username + " faculty member");
                    System.out.println("Type 1 for Renting, 2 for Returning or 3 for Extending rental period and press enter");
                    return false;

                }
            }
            if (!loggedIn) {
                System.out.println("Username not found.");
            }

        }

        return loggedIn;
    }

    //is a funtion to check if the input of book is in the dummy database
    // is a Book funtion and returns the book for either renting lending og extending rental date

    public static Book checkForBook(String bookString) {
        for (Book book : listOfBooks()) {
            if (bookString.equals(book.getTitle().toString().toLowerCase(Locale.ROOT))) {
                return book;
            }

        }
        System.out.println("Book not found or invalid input");
        return null;
    }

    // its a funtion that preforms the operation found in the funtion below, i.e
    // if its renting it prefors the renting funtion with the data we have gather so far.
    public static void preformOperation(int input, boolean studentBoolean, String username, Student student, FacultyMember facultyMember, Book book, LibrarySystem librarySystem) throws UserOrBookDoesNotExistException {
        switch (input) {
            case 1:
                if (studentBoolean) {
                    librarySystem.borrowBook(student, book);
                    System.out.println("The Book " + book.getTitle().toString() + " has been borrowed to the student " + username);
                    break;
                } else
                    librarySystem.borrowBook(facultyMember, book);
                System.out.println("The Book " + book.getTitle().toString() + " has been borrowed to the faculty member " + username);
                break;
            case 2:
                if (studentBoolean) {
                    librarySystem.returnBook(student, book);
                    System.out.println("The Book " + book.getTitle().toString() + " has been returned by the student " + username);
                    break;
                } else
                    librarySystem.returnBook(facultyMember, book);
                System.out.println("The Book " + book.getTitle().toString() + " has been returned by the faculty member " + username);
                break;
            case 3:
                librarySystem.extendLending(facultyMember, book, LocalDate.now().plusDays(15));
                System.out.println("The Book " + book.getTitle().toString() + " has been extended in rental for 15 days by the faculty member " + username);
                break;
        }
    }
//its a funtion that checks for witch operation the user put in and checks if student is trying to extend rental period
    // else it prints available books and asks the user to select a book


    public static void checkForOperation(int input, boolean student) {

        switch (input) {
            case 3:
                if (student) {
                    System.out.println("Only Faculty Members can extend rental period!");
                    break;
                } else
                    for (Book book : listOfBooks()) {
                        System.out.println(book.getTitle());
                    }
                System.out.println("please type name of the book and press enter");
                break;
            default:
                for (Book book : listOfBooks()) {
                    System.out.println(book.getTitle());
                }
                System.out.println("please type name of the book and press enter");

        }
    }


}

