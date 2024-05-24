package studentInfoSystem;

public class Transcription {
	String student_id;
    String course_id;
    int grade;
    int transcript_id;

    public Transcription(String student_id, String course_id, int transcript_id,int grade) {
        this.student_id = student_id;
        this.course_id = course_id;
        this.grade = grade;
        this.transcript_id=transcript_id;
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


    public int getGrade() {
        return grade;
    }


    public void setGrade(int grade) {
        this.grade = grade;
    }


    public int getTranscript_id() {
        return transcript_id;
    }


    public void setTranscript_id(int transcript_id) {
        this.transcript_id = transcript_id;
    }


    public void display() {
    	System.out.println("student id :"+student_id);
    	System.out.println("course id:"+course_id);
    	System.out.println("grade id:"+grade);
        System.out.println("Transcript:"+transcript_id);
    }


}
