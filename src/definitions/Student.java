/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String studentName;
    private long universityRollNo;
    private int numberOfBooksIssued;
    private Book[] namesOfBooksIssued;

    public Student() {
        studentName = "Sohan";
        universityRollNo = 191500245L;
        numberOfBooksIssued = 3;
        namesOfBooksIssued = new Book[]{};
    }

    public Student(String studentName, long universityRollNo, int numberOfBooksIssued, Book[] namesOfBooksIssued) {
        this.studentName = studentName;
        this.universityRollNo = universityRollNo;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.namesOfBooksIssued = namesOfBooksIssued;
    }


}
