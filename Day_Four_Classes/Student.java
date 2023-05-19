package Day_Four_Classes;

public class Student {

    private int studentId;
    private String studentName;
    private String gradeYear;
    private String extracurricular;

    // Default constructor
    public Student() {
    }

    // Constructor with all properties
    public Student(int studentId, String studentName, String gradeYear, String extracurricular) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gradeYear = gradeYear;
        this.extracurricular = extracurricular;
    }

    // Getter for studentId
    public int getStudentId() {
        return studentId;
    }

    // Setter for studentId
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Getter for studentName
    public String getStudentName() {
        return studentName;
    }

    // Setter for studentName
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter for gradeYear
    public String getGradeYear() {
        return gradeYear;
    }

    // Setter for gradeYear
    public void setGradeYear(String gradeYear) {
        this.gradeYear = gradeYear;
    }

    // Getter for extracurricular
    public String getExtracurricular() {
        return extracurricular;
    }

    // Setter for extracurricular
    public void setExtracurricular(String extracurricular) {
        this.extracurricular = extracurricular;
    }

    // toString method to represent the Student object as a string
    @Override
    public String toString() {
        return "Student {\n" +
                "studentId=" + studentId +
                ",\n studentName='" + studentName + '\'' +
                ",\n gradeYear='" + gradeYear + '\'' +
                ",\n extracurricular='" + extracurricular + '\'' +
                "\n}";
    }
}
