package TextGui;

import org.example.Author;
import org.example.Book;
import org.example.FacultyMember;
import org.example.Student;

import java.util.ArrayList;
import java.util.List;

public class DummyData {


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


    public static List<FacultyMember> listOfFacultymembers() {
        List<FacultyMember> list = new ArrayList<FacultyMember>();
        FacultyMember facultyMember1 = new FacultyMember("John", "Library Manager");
        FacultyMember facultyMember2 = new FacultyMember("Rose", "Library");
        FacultyMember facultyMember3 = new FacultyMember("Paul", "Library");
        FacultyMember facultyMember4 = new FacultyMember("Gilli", "Library");
        FacultyMember facultyMember5 = new FacultyMember("Stefan", "Janitor");


        list.add(facultyMember1);
        list.add(facultyMember2);
        list.add(facultyMember3);
        list.add(facultyMember4);
        list.add(facultyMember5);

        return list;
    }

    public static List<Student> listOfStudents() {
        List<Student> list = new ArrayList<Student>();
        Student student1 = new Student("Ingvar", true);
        Student student2 = new Student("Dave", false);
        Student student3 = new Student("Jenna", false);
        Student student4 = new Student("Kelly", true);
        Student student5 = new Student("Victor", true);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        return list;
    }


}
