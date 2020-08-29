/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String studentName;
    private long universityRollNo;
    private int numberOfBooksIssued;
    private Book[] namesOfBooksIssued;


    public Student(String studentName, long universityRollNo, int numberOfBooksIssued, Book[] namesOfBooksIssued) {
        this.studentName = studentName;
        this.universityRollNo = universityRollNo;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.namesOfBooksIssued = namesOfBooksIssued;
    }

    public Student(String studentName) {
        this.studentName = studentName;
        universityRollNo = 191500375L;
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
        return universityRollNo;
    }

    public void setUniversityRollNo(long universityRollNo) {
        this.universityRollNo = universityRollNo;
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
        return universityRollNo == student.universityRollNo &&
                numberOfBooksIssued == student.numberOfBooksIssued &&
                Objects.equals(studentName, student.studentName) &&
                Arrays.equals(namesOfBooksIssued, student.namesOfBooksIssued);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(studentName, universityRollNo, numberOfBooksIssued);
        result = 31 * result + Arrays.hashCode(namesOfBooksIssued);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", universityRollNo=" + universityRollNo +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", namesOfBooksIssued=" + Arrays.toString(namesOfBooksIssued) +
                '}';
    }

    public void issueBook(String name) {
        System.out.println(name + "book was issued for you");
    }

    public void returnBook(String name) {

        System.out.println("thank You for returning" + name + ".Hope you read it");
    }

    public void listInventory() {
        for (Book book : namesOfBooksIssued) {
            System.out.println(book);
        }
    }


}
