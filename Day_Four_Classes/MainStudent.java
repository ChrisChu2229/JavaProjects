package Day_Four_Classes;

public class MainStudent {

    public static void main(String[] args) {
        // Create a new student
        Student student = new Student(1234, "John Doe", "Junior", "Basketball");

        // Print the initial properties
        System.out.println(student.toString());

        // Modify properties using setters
        student.setStudentId(5678);
        student.setStudentName("Jane Doe");
        student.setGradeYear("Senior");
        student.setExtracurricular("Soccer");

        // Print the modified properties
        System.out.println(student.toString());
    }
}
