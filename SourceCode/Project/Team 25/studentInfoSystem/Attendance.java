package studentInfoSystem;

public class Attendance {
	int attendance_id;
    String student_id;
    String course_id;
    String date;
    String status;

    public Attendance( int attendance_id,String student_id,String course_id ,String date,String status) {
        this.attendance_id = attendance_id;
        this.student_id = student_id;
        this.course_id = course_id;
        this.date=date;
        this.status=status;
    } 
    public int getAttendance_id() {
        return attendance_id;
    }
    public void setAttendance_id(int attendance_id) {
        this.attendance_id = attendance_id;
    }
    public String getStudent_id() {
        return student_id;
    }
    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }
    public String getCourse_id() {
        return course_id;
    }
    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void display() {
        System.out.println("Attendance_id:"+attendance_id);
        System.out.println("student id:"+student_id);
        System.out.println("course id:"+course_id);
        System.out.println("Status: " + status);
        System.out.println("Date: " + date);
        
    }


}
