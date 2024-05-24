package studentInfoSystem;

public class Enrollment {
	int student_id;
    int enrollment_id;
    String course_id;

    public Enrollment(int student_id,String course_id,int enrollment_id) {
        this.student_id = student_id;
        this.course_id= course_id;
        this.enrollment_id = enrollment_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getEnrollment_id() {
        return enrollment_id;
    }

    public void setEnrollment_id(int enrollment_id) {
        this.enrollment_id = enrollment_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public void display() {
        System.out.println("Enrollment_id:"+enrollment_id);
        System.out.println("Enter the course ID"+course_id);
        System.out.println("Student_id: " + student_id);
    }


}
