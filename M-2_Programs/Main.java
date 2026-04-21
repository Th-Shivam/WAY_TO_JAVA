import java.io.Serializable;

// Yahan se 'public' hata diya hai
class StudentBean implements Serializable {
    private String studentName;

    public StudentBean() {}

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}

// Ye public rahegi aur file ka naam bhi yahi hoga
public class Main {
    public static void main(String[] args) {
        StudentBean student = new StudentBean();
        student.setStudentName("Rahul Sharma");
        System.out.println("Student Name: " + student.getStudentName());
    }
}