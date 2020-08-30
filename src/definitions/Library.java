/*  Created by IntelliJ IDEA.
 *  User: Dimpal Agrawal
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] booksCurrentlyAvailable;

    public Library() {
        this.booksCurrentlyAvailable = new Book[10];
        for (int i = 0; i < booksCurrentlyAvailable.length; i++) {
            booksCurrentlyAvailable[i] = new Book("Book " + (i + 1));
        }
    }

    public Library(Book[] store) {
        this.booksCurrentlyAvailable = store;
    }

    public Book[] getStore() {
        return booksCurrentlyAvailable.clone();
    }

    public void setStore(Book[] store) {
        this.booksCurrentlyAvailable = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(booksCurrentlyAvailable, library.booksCurrentlyAvailable);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(booksCurrentlyAvailable);
    }

    @Override
    public String toString() {
        return "Library{" +
                "store=" + Arrays.toString(booksCurrentlyAvailable) +
                '}';
    }

    /**
     * This method adds a book to a library.
     *
     * @param name The name of the book to be added.
     */

    public void doIssueBook(String name) {
        System.out.println(name + "book was issued for you");
    }

    /**
     * This method returns the book back to the library .
     *
     * @param name The name of the book you want to return
     */

    public void doReturnBook(String name) {
        System.out.println("thank You for returning" + name + ".Hope you read it");
    }

    /**
     * This method shows a list of books in our inventory
     */

    public void listInventory() {
        for (Book book : booksCurrentlyAvailable) {
            System.out.println(book);
        }
    }
}
