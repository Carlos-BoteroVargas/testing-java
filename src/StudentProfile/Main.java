package StudentProfile;

public class Main {

    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile("Sally", "Salmon", "Film", 3.75, 2022);
        StudentProfile profileTwo = new StudentProfile("Max", "Tiffen", "Computer Science", 3.45, 2021);

        System.out.println("Student One profile:");
        System.out.println("  - Full Name: " + profileOne.firstName + " " + profileOne.lastName);
        System.out.println("  - Declared Major: " + profileOne.declaredMajor);
        System.out.println("  - GPA: " + profileOne.gpa);
        System.out.println("  - Expected graduation: " + profileOne.expectedYearToGraduate);
        System.out.println("-----------------");



        profileTwo.incrementExpectedGraduationYear();
        System.out.println("Expected graduation of student Two: " + profileTwo.expectedYearToGraduate);
    }
}
