package com.workspace;

import java.util.ArrayList;

/**
 * Created by Dawna on 5/22/2017.
 */
public class Roster {
    static ArrayList<Student> roster = new ArrayList<>();

    public static void add(String studentID, String firstName, String lastName, String emailAddress, int age, int grade1, int grade2, int grade3)
    {
        int[] grades = {grade1, grade2, grade3};
        Student newStudent = new Student(studentID, firstName, lastName, emailAddress, age, grades);
        roster.add(newStudent);
    }

    public static void remove(String studentID) {
        for(Student s : roster) {

            if (s.getStudentID().equals(studentID)) {
                System.out.println("Removed student with ID: " + studentID + " from the roster");
                System.out.println();
                roster.remove(s);
//                print_all();
                return;
            }
        }

        System.out.println("Student with ID: " + studentID + " was not found");
        System.out.println();
    }

    public static void print_all(){
        // loop through roster ArrayList
        for(int i = 0; i < roster.size(); i++) {
            roster.get(i).print();
        }
        System.out.println();
    }

    public static void print_average_grade(String studentID) {
        for(Student s : roster) {
            if(s.getStudentID().equals(studentID)) {
                double averageGrade = (s.getGrades()[0] + s.getGrades()[1] + s.getGrades()[2]) / 3.0;
                System.out.println("Student ID:\t" + studentID +  "\tAverage Grade:\t" + averageGrade);
                System.out.println();
            }

        }
    }

    public static void print_invalid_emails() {
        for(Student s : roster) {
            if(!(s.getEmailAddress().contains("@"))) {
                System.out.println("The following record contains an invalid email address:\t" +                                    "\tStudent ID:\t" + s.getStudentID() +
                                      "\tEmail Address:\t" + s.getEmailAddress());
                System.out.println();
            }

            if(!(s.getEmailAddress().contains("."))) {
                System.out.println("The following record contains an invalid email address:\t" +                                    "\tStudent ID:\t" + s.getStudentID() +
                        "\tEmail Address:\t" + s.getEmailAddress());
                System.out.println();
            }

            if(s.getEmailAddress().contains(" ")) {
                System.out.println("The following record contains an invalid email address:\t" +                                    "\tStudent ID:\t" + s.getStudentID() +
                        "\tEmail Address:\t" + s.getEmailAddress());
                System.out.println();
            }




        }


    }
}
