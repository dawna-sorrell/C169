package com.workspace;
import com.workspace.Student;
import com.workspace.Roster;

import static com.workspace.Roster.*;

public class Main {

    public static void main(String[] args) {

        Roster.add("1", "John", "Smith", "John1989@gmail.com", 20, 88, 79, 59);

        Roster.add("2", "Suzan", "Erickson", "Erickson_1990@gmail.com", 19, 91, 72, 85);

        Roster.add("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, 85, 84, 87);

        Roster.add("4", "Erin", "Black", "Erin.black@comcast.net", 22, 91, 98, 82);

        Roster.add("5", "Dawna", "Sorrell", "dsorre2@my.wgu.edu", 35, 90, 89, 86);

        print_all();
        print_invalid_emails();

        for(Student s : roster) {
            print_average_grade(s.getStudentID());
        }

        remove("3");
        remove("3");

    }
}
