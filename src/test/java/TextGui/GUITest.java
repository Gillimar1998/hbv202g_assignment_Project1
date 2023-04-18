package TextGui;

import org.example.Author;
import org.example.Book;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GUITest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @org.junit.Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @org.junit.After
    public void restoreStreams() {
        System.setOut(originalOut);
    }


    public static List<Book> listOfBooks() {
        List<Book> list = new ArrayList<Book>();
        Author author1 = new Author("Tolkien");
        Book book1 = new Book("Lord of the Rings", author1);
        Author author2 = new Author("George");
        Book book2 = new Book("Game of Thrones", author2);
        Author author3 = new Author("R.k.Rowling");
        Book book3 = new Book("Harry Potter", author3);
        Author author4 = new Author("Palli");
        Book book4 = new Book("saga Palla", author4);
        Author author5 = new Author("Isak");
        Book book5 = new Book("How to Code like Isak", author5);
        Author author6 = new Author("Vampsy");
        Book book6 = new Book("The Story of Vampsy", author6);
        Author author7 = new Author("Bjolli");
        Book book7 = new Book("out with the dog", author7);
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);
        list.add(book7);
        return list;
    }

    @org.junit.Test
    public void login() {
        // Test case for when a valid student logs in

        //Test case for when a valid faculty member logs in
        assertFalse(GUI.login("Gilli"));

        //Test case for when an invalid user logs in
        assertFalse(GUI.login("invalidusername"));
    }

    @org.junit.Test
    public void checkForBook() {
        // few books from the database
        Author author1 = new Author("Tolkien");
        Book book1 = new Book("lord of the rings", author1);
        Author author2 = new Author("George");
        Book book2 = new Book("Game of Thrones", author2);
        Author author3 = new Author("R.k.Rowling");
        Book book3 = new Book("Harry Potter", author3);

        // making few GUI.checkForBook results

        Book result1 = GUI.checkForBook("Lord of the Rings");
        Book result2 = GUI.checkForBook("Game of Thrones");
        Book result3 = GUI.checkForBook("invalid input");

        // testing results


        assertNull(result3);

    }


    @org.junit.Test
    public void checkForOperation_student() {
        GUI.checkForOperation(3, true);
        String expectedOutput = "Only Faculty Members can extend rental period!";
        String systemOutput = outContent.toString().trim();
        assertEquals(expectedOutput, systemOutput);
    }

    @org.junit.Test
    public void checkForOperation_faculty() {
        // test case for faculty member and input 3 (extend rental period)
        GUI.checkForOperation(3, false);
        String expectedOutput = "";
        String systemOutput = outContent.toString().trim();
        for (Book book : listOfBooks()) {
            expectedOutput += book.getTitle() + System.lineSeparator();
        }
        expectedOutput += "please type name of the book and press enter";
        assertEquals(expectedOutput, systemOutput);
    }


}
