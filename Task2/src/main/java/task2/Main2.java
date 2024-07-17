package main.java.task2;

public class Main2 {
    public static void main(String[] args) {
        StudentGradeCalculator calculator = new StudentGradeCalculator();
        calculator.inputSubjects();
        calculator.inputMarks();
        calculator.calculateTotalAndAverage();
        calculator.assignGrade();
        calculator.displayResults();
    }
}
