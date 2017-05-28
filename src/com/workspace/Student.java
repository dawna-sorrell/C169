package com.workspace;

/**
 * Created by Dawna on 5/22/2017.
 */
public class Student {
    private String studentID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    private int[] grades;

    // Constructor
    public Student() {

    }

    public Student(String studentID, String firstName, String lastName, String emailAddress, int age, int[] grades) {
        setStudentID(studentID);
        setFirstName(firstName);
        setLastName(lastName);
        setEmailAddress(emailAddress);
        setAge(age);
        setGrades(grades);
    }



    // Accessor/getter
    public String getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getAge() {
        return age;
    }

    public int[] getGrades() {
        return grades;
    }


    // Mutator/setter
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }



    // print()
    public void print(){
        System.out.println("StudentID:\t" + getStudentID() +
                           "\tFirstName:\t" + getFirstName() +
                           "\tLastName:\t" + getLastName() +
                           "\tEmail Address:\t" + getEmailAddress() +
                           "\tAge:\t" + getAge() +
                           "\tGrade 1: " + getGrades()[0] +
                           "\tGrade 2: " + getGrades()[1] +
                           "\tGrade 3: " + getGrades()[2]);
    }
}
