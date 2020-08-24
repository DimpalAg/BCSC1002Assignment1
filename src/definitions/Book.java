/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookIsbnNumber;

    //constructors  ->  default constructors,parametrized constructors
    public Book() {
        bookName = "Java Programming";
        bookAuthor = "Mr.Divyansh Bhardwaj";
        bookIsbnNumber = String.valueOf(2342567892567L);
    }

    public Book(String bookName, String bookAuthor, String bookIsbnNumber) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookIsbnNumber = bookIsbnNumber;
    }

    //getter and setter methods
    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookIsbnNumber() {
        return bookIsbnNumber;
    }

    public void setBookIsbnNumber(String bookIsbnNumber) {
        this.bookIsbnNumber = bookIsbnNumber;
    }

    //toString methods
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookIsbnNumber='" + bookIsbnNumber + '\'' +
                '}';
    }

    public String toString(String bookName, String bookAuthor, String bookIsbnNumber) {
        return String.format("Book Name:%s, Book Author: %s ,BookISBNnumber:%s",
                getBookName(), getBookAuthor(), getBookIsbnNumber());
    }

    //equals methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(bookAuthor, book.bookAuthor) &&
                Objects.equals(bookIsbnNumber, book.bookIsbnNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuthor, bookIsbnNumber);
    }
}
