/*  Created by IntelliJ IDEA.
 *  User: Dimpal Agrawal
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int LIST_INVENTORY = 3;
    private static final int EXIT = 4;
    private Student[] detailsOfStudentCurrentlyInteracting;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clientInput;
        String studentName;
        long universityRollNumber;
        Student student = new Student();
        do {
            System.out.println("_=_=__=_=_Welcome To the Front Desk_=_=__=_=_");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return the previously issues books");
            System.out.println("3. Show all previously issue books");
            System.out.println("4. Exit");

            clientInput = scanner.nextInt();
            switch (clientInput) {
                case ISSUE_BOOK:
                    System.out.println("enter your name");
                    scanner.nextLine();
                    studentName = scanner.next();
                    System.out.println("enter your university Rollno");
                    universityRollNumber = scanner.nextLong();
                    System.out.println("Enter the name of the book that you want to issue");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    student.doIssueBook(bookName);
                    break;
                case RETURN_BOOK:
                    System.out.println("enter your name");
                    studentName = scanner.next();
                    scanner.nextLine();
                    System.out.println("enter your university Rollno");
                    universityRollNumber = scanner.nextLong();
                    System.out.println("Enter the name of the book that you want to return");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    student.doReturnBook(bookName);
                    break;
                case LIST_INVENTORY:
                    student.listInventory();
                    break;
                default:
                    System.out.println("WRONG CHOICE");
            }
        } while (clientInput != EXIT);
        scanner.close();
    }
}

