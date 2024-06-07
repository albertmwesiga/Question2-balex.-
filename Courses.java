
package com.mycompany.balex;

import java.util.Scanner; 

public class Courses {
    public static void main(String[] args) {
        // Declare the variables for the courses
        String[] courseIDs = {"BSE", "BIT", "BCS", "BCE"};
        String[] courseNames = {
            "Software Engineering",
            "Information Technology",
            "Computer Science",
            "Computer Engineering"
        };
        int[] tuitions = {900000, 750000, 800000, 950000};

        // Prompt the applicant to input the CourseID
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CourseID: ");
        String inputCourseID = scanner.nextLine();

        // Find and display the course details
        boolean found = false;  // Flag to check if CourseID is found
        for (int i = 0; i < courseIDs.length; i++) {
            if (courseIDs[i].equalsIgnoreCase(inputCourseID)) {
                System.out.println("Course Name: " + courseNames[i]);
                System.out.println("Tuition: " + tuitions[i]);
                found = true;
                break;
            }
        }

        // If CourseID not found, display an error message
        if (!found) {
            System.out.println("Wrong CourseID details");
        }

        scanner.close();  // Close the scanner
    }
}
