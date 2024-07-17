package main.java.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGradeCalculator {
    private List<String> subjects;
    private double[] marks;
    private double totalMarks;
    private double averagePercentage;
    private char grade;
    private Scanner scanner;


    public StudentGradeCalculator() {
        subjects = new ArrayList<>();
        marks = new double[0];
        totalMarks = 0.0;
        averagePercentage = 0.0;
        grade = ' ';
        scanner = new Scanner(System.in);
    }

    public void inputSubjects() {
        System.out.println("Enter the name of the Subjects (Type 'done' when Finished):");
        while (scanner.hasNext()) {
            String subject = scanner.nextLine();
            if (subject.equalsIgnoreCase("done")) break;
            subjects.add(subject);
        }
    }


    public void inputMarks() {
        marks = new double[subjects.size()];
        for (int i = 0; i < subjects.size(); i++) {
            System.out.print("Enter marks for " + subjects.get(i) + ": ");
            marks[i] = scanner.nextDouble();
        }
    }

    public void calculateTotalAndAverage() {
        totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }
        averagePercentage = totalMarks / subjects.size();
    }

    public void assignGrade() {
        if (averagePercentage >= 90) grade = 'A';
        else if (averagePercentage >= 80) grade = 'B';
        else if (averagePercentage >= 70) grade = 'C';
        else if (averagePercentage >= 60) grade = 'D';
        else grade = 'F';
    }

    public void displayResults() {
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
