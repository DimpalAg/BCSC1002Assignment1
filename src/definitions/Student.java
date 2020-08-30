/*  Created by IntelliJ IDEA.
 *  User: Dimpal Agrawal
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String studentName;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] namesOfBooksIssued;

    public Student(String studentName, long universityRollNo, int numberOfBooksIssued, Book[] namesOfBooksIssued) {
        this.studentName = studentName;
        this.universityRollNumber = universityRollNo;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.namesOfBooksIssued = namesOfBooksIssued;
    }

    public Student(String studentName) {
        this.studentName = studentName;
        universityRollNumber = 191500375L;
        numberOfBooksIssued = 5;
        namesOfBooksIssued = new Book[]{};
    }

    public Student() {
        this.namesOfBooksIssued = new Book[10];
        for (int i = 0; i < namesOfBooksIssued.length; i++) {
            namesOfBooksIssued[i] = new Book("Book" + (i + 1));
        }
    }

    public Student(Book[] namesOfBooksIssued) {
        this.namesOfBooksIssued = namesOfBooksIssued;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getUniversityRollNo() {
        return universityRollNumber;
    }

    public void setUniversityRollNo(long universityRollNo) {
        this.universityRollNumber = universityRollNo;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getNamesOfBooksIssued() {
        return namesOfBooksIssued;
    }

    public void setNamesOfBooksIssued(Book[] namesOfBooksIssued) {
        this.namesOfBooksIssued = namesOfBooksIssued;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNumber == student.universityRollNumber &&
                numberOfBooksIssued == student.numberOfBooksIssued &&
                Objects.equals(studentName, student.studentName) &&
                Arrays.equals(namesOfBooksIssued, student.namesOfBooksIssued);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(studentName, universityRollNumber, numberOfBooksIssued);
        result = 31 * result + Arrays.hashCode(namesOfBooksIssued);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", universityRollNo=" + universityRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", namesOfBooksIssued=" + Arrays.toString(namesOfBooksIssued) +
                '}';
    }

    /**
     * This method allows a student to issue a book.
     *
     * @param name The name of the book that student issue.
     */

    public void doIssueBook(String name) {
        System.out.println(name + "book was issued for you");
    }

    /**
     * This method allows a student to return a book .
     *
     * @param name The name of the book that student want to return
     */

    public void doReturnBook(String name) {
        System.out.println("thank You for returning" + name + ".Hope you read it");
    }

    /**
     * This method shows a list of books issued by a student
     */

    public void listInventory() {
        for (Book book : namesOfBooksIssued) {
            System.out.println(book);
        }
    }
}