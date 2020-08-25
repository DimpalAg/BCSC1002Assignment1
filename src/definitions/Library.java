/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

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


}
