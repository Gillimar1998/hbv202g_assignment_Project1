package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<Book> books = new ArrayList<Book>();
    private List<User> users = new ArrayList<User>();

    private List<Lending> lendings = new ArrayList<Lending>();

    // (If fields are not initialised above, this would need to be done in the constructor or below.
    public LibrarySystem() {
        // TODO Auto-generated constructor stub
    }


    // TODO Throw exception if list of authors is empty
    // Add book using title and author
    public void addBookWithTitleAndAuthorlist(String title, Author author) throws NotAtLeastOneAuthorProvided {
        books.add(new Book(title, author));

    }

    // Add new user of type student with a name and feePaid flag
    public void addStudentUser(String name, boolean feePaid) {
        users.add(new Student(name, feePaid));
    }

    // Add new user of type FacultyMember with a name and department
    public void addFacultyMemberUser(String name, String department) {
        users.add(new FacultyMember(name, department));
    }

    // find book by title
    // Note: the assignment did require to implement the body of this method
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    // find user by name
    // Note: the assignment did require to implement the body of this method
    public User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    // a user of type User can borrow a book of type Book
    // TODO: We could introduce a further exception if it is tried to borrow a book that is currently already borrowed
    // Note: the assignment did require to implement the body of this method
    public void borrowBook(User user, Book book) {
        lendings.add(new Lending(book, user));
    }

    // extend a lending of a book of type Book for a user of type FacultyMember
    // TODO Throw exception if list of user or book does not exist
    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) throws UserOrBookDoesNotExistException {

    }

    // return a book from a user
    // TODO Throw exception if list of user or book does not exist
    public void returnBook(User user, Book book) throws UserOrBookDoesNotExistException {

    }

}

