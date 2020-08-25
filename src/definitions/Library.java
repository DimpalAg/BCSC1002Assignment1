/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] store;

    public Library() {
        this.store = new Book[10];
        for (int i = 0; i < store.length; i++) {
            store[i] = new Book("Book " + (i + 1));
        }
    }

    public Library(Book[] store) {
        this.store = store;
    }

    public Book[] getStore() {
        return store.clone();
    }

    public void setStore(Book[] store) {
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(store, library.store);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(store);
    }

    @Override
    public String toString() {
        return "Library{" +
                "store=" + Arrays.toString(store) +
                '}';
    }
}
