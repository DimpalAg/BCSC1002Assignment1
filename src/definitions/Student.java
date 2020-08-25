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
}
