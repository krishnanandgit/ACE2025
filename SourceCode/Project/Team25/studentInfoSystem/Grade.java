package studentInfoSystem;

public class Grade {
	String student_id;
    int grade_id;
    String course_id;
    String score;

    public Grade(String student_id, int grade_id, String course_id, String score) {
        this.student_id = student_id;
        this.grade_id = grade_id;
        this.course_id = course_id;
        this.score=score;
    }
    
 
    public String getStudent_id() {
        return student_id;
    }


    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }


    public int getGrade_id() {
        return grade_id;
    }


    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }


    public String getCourse_id() {
        return course_id;
    }


    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }


    public String getScore() {
        return score;
    }


    public void setScore(String score) {
        this.score = score;
    }


    public void display() {
        System.out.println("student id:"+student_id);
        System.out.println("Grade:"+grade_id);
        System.out.println("course id:"+course_id);
        System.out.println("score: " + score);
    }


}
