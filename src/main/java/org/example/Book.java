package org.example;

public class Book {

    //private List<Author> authors = new ArrayList<Author>();

    private String title;
    private Author author;

    // TODO throw exception if author list is empty
    public Book(String title, Author author) {
        super();
        this.author = author;
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    // TODO throw exception if author list is empty
    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
